function validate(){
	var name=document.myform.itemname.value;
	var price=document.myform.price.value;
	var launch=document.myform.date.value;
	var radio= document.myform.active.value;
	
	if(name==null||name==""){
		alert("name is required");
		return false;
	}

	if(price==null||price==""){
		alert("price is required");
		return false;
	}
	
	if(launch==null||launch==""){
		alert("date is required");
		return false;
	}
	
	if(radio==null||radio==""){
		alert("active type is required");
		return false;
	}
	var regex = /^[a-zA-Z ]{2,65}$/;
	
	if(regex.test(name)){
		alert("Menu Items saved successfully");
		return true;
	}
	else{
		alert("name must be between 2 to 65")
		return false;
	}
	 	
	
	
}
