function validate(){
	var name=document.myform.itemname.value;
	var price=document.myform.price.value;
	var launch=document.myform.date.value;
	
	if(name==null||name==""){
		alert("name is required");
	}

	if(price==null||price==""){
		alert("price is required");
	 }
	
	if(launch==null||launch==""){
		alert("date is required");
	}
	
}
