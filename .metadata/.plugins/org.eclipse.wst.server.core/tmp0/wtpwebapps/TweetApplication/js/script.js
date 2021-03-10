/**
 * 
 */
// Include truYum form validation functions here
function validateForm(edit){
	var name = edit.elements["firstname"].value.trim();
	var testName = /^[A-Za-z ]{2,65}$/;
	if(name == "" || name == null ){
		alert("First Name is required.");
		return false ;
	}
	var mail = edit.elements["email"].value.trim();
	if(mail == "" || mail== null) {
		alert("Mail is required.");
		return false ;
	}
	var decimal=  /^[A-Za-z]\w{7,14}$/;
	var pass = edit.elements["password"].value.trim();
	if(!pass.match(decimal)) {
		alert("Password doesnot meet limit");
		return false;
	}
	var  cpass= edit.elements["cpassword"].value.trim();
	if(cpass != pass){
		alert("Password and Confirm password doesnot match");
		return false;
	}
	var gender = edit.elements["gender"].value.trim();
	if(gender == "" || gender == null ){
		alert("Gender is required.");
		return false ;
	}
	
	var dob = edit.elements["date"].value.trim();
	if(dob == "" || dob == null ){
		alert("Date of Birth is required.");
		return false ;
	}
	
	
	
	return true ;	
}
