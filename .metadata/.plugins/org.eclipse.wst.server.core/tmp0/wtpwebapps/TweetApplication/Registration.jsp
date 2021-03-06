<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page </title>
<script src="js/script.js"></script>
<link rel="stylesheet" href="Style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body id="promoimage">
 <div class="container">
   <div class="row">
      <div class="col-lg-3"></div>
      <div class="col-lg-6">
        <div id="ui">
         <div id="errorText"><p > ${error}</p></div> 
           <form action="User" name="edit" class="form-group" method="post">
             <div class="row">
               <div class="col-lg-6">
                 
                 <label>First Name</label>
                 <input type="text" name="firstname" class="form-control"  placeholder="Enter your First Name">
               </div>
               <div class="col-lg-6">
                 <label>Last Name</label>
                 <input type="text" name="lastname" class="form-control"  placeholder="Enter your Last Name">
               </div>
             </div>
             <br>
              <label>E-Mail</label>
                 <input type="text" name="email" class="form-control"  placeholder="Enter your E-Mail">
               <br>
              <div class="row">
               <div class="col-lg-6">
                 <label>Password</label>
                 <input type="password" name="password" class="form-control" placeholder="Enter Password" >
               </div>
               <div class="col-lg-6">
                 <label>Confirm Password</label>
                 <input type="password" name="cpassword" class="form-control"  placeholder="Confirm Password">
               </div>
             </div>
              <br>
           <div class="row">
              <div class="col-sm-4">
                <label>Gender</label>
              </div>
               
               <div class="col-sm-4">
                <div class="form-check form-check-inline">
                  <input class="form-check-input" type="radio" name="gender" id="Radio1" value="Male" >
                  <label class="form-check-label" for="Radio1">Male</label>
                  </div>
               </div>
               <div class="col-sm-4">
                <div class="form-check form-check-inline">
                  <input class="form-check-input" type="radio" name="gender" id="Radio2" value="Female" >
                  <label class="form-check-label" for="Radio2">Female</label>
                </div>
               </div>
             </div>
           
           <div class="form-group"> <!-- Date input -->
        <label class="control-label" for="date">Date</label>
        <input class="form-control" id="date" name="date" placeholder="DD/MM/YYYY" type="text"/>
      </div>
      <div class="form-group" id="buttonlogin"> <!-- Submit button -->
        <button class="btn btn-primary btn-lock btn-lg "  name="submit" type="submit" onclick="return validateForm(edit)">Submit</button>
      </div>
           
           </form>
        </div>
      
      </div>
       
      <div class="col-lg-3"></div>
   </div>
 </div>
</body>
</html>