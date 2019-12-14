function validate() {
	var title = document.myform.title.value;
	var gross = document.myform.boxOffice.value;
	var launch = document.myform.dateOfLaunch.value;
	var radio = document.myform.active.value;

	if (title == null || title == "") {
		alert("Title is required");
		return false;
	}

	if (gross == null || gross == "") {
		alert("box office gross is required");
		return false;
	}

	if (launch == null || launch == "") {
		alert("date is required");
		return false;
	}

	if (radio == null || radio == "") {
		alert("active type is required");
		return false;
	}
	var regex = /^[a-zA-Z0-9._-]{2,100}$/;

	if (regex.test(title)) {
		alert("Menu Items saved successfully");
		return true;
	} else {
		alert("name must be between 2 to 100")
		return false;
	}

}
