		
		
		//GLOBALES
		let provincia="";
		let distrito=-1;
		
		$.get("/ubigeo/listaDepartamento",function(datos){
			$.each(datos,function(index,item){
				                           //solo se pone item ya que es un arrayList y no un objeto
				$("#idDepartamento").append("<option value='"+item+"'>"+item+"</option>");
			});
		});
		                                          //function() -->funcion anonima  
		$(document).on("change","#idDepartamento",function(){
		var dep;
		dep=$(this).val();
		
		$("#idProvincia").empty();
		$("#idProvincia").append("<option value=' '>[Seleccione Provincia]</option>");
		$("#idDistrito").empty();
		$("#idDistrito").append("<option value=' '>[Seleccione Distrito]</option>");
		$.get("/ubigeo/listaProvincia?departamento="+dep,function(datos){
			$.each(datos,function(index,item){
				$("#idProvincia").append("<option value='"+item+"'>"+item+"</option>");
			})
			$("#idProvincia").val(provincia);
			$("#idProvincia").trigger("change");

			})
		})
		
		$(document).on("change","#idProvincia",function(){
		var pro;
		pro=$(this).val();
		
		$("#idDistrito").empty();
		$("#idDistrito").append("<option value=' '>[Seleccione Distrito]</option>");
		$.get("/ubigeo/listaDistrito?provincia="+pro,function(datos){
			$.each(datos,function(index,item){
				$("#idDistrito").append("<option value='"+item.codigo+"'>"+item.distrito+"</option>");
			})		
			$("#idDistrito").val(distrito);	
			})
		})


