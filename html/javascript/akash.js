function validate()
{
    var regex = /^[a-zA-Z ]{2,30}$/;    
    if(ctrl.value == "null" || ctrl.value == "") {
	alert("Name cannot be empty");
        return false;
	}
    if( ctrl.value.length == "1"){
	alert("Name length should be between 2 to 30 characters ");
	return false;
	}
 	
    if(pass.value.length == "0"){
	alert("Password cannot be empty");
	return false;
}
	if (regex.test(ctrl.value)) {
        alert("Details submitted successfully");
	return true;
    }
}

