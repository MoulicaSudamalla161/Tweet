<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="Style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body id="promoimage">
  <div class="container">
   <div class="row">
      <div class="col-lg-3" >
        
      </div>
      <div class="col-lg-6">
        <div id="ui">
           <form action="Login" class="form-group" method="post">
           
             <div class="row">
               <div class="col-lg-6">
               <div><p> ${errorMessage}</p></div>
               <div id="signIn"> <h1>Sign In</h1></div>
                 <label>E-Mail</label>
                 <input type="text" name="email" class="form-control"    placeholder="Enter your E-Mail">
                 <br>
               </div>
              </div>
           
               <div class="row">
               <div class="col-lg-6">
                 <label>Password</label>
                 <input type="password" name="password" class="form-control" placeholder="Enter Password" >
               </div>
              </div>
              <br>
           
      <div class="form-group" id="loginbutton"> <!-- Submit button -->
        <button class="btn btn-primary btn-lock btn-lg "  name="submit" type="submit" >Login</button>
      </div>
      
     
     <div class="row">
              <div class="col-lg-6">
              
      <p id="signIn">Don't have an account?</p>
       </div>
      <div class="col-lg-6">
     
        <a href="Registration.jsp" class="refer" > Sign Up</a>
     
     </div>
     </div>
     
         <a href="ForgotLink.jsp" class="refer"> Forgot Password?</a>
               <!--   <button class="btn btn-primary btn-lock btn-lg "  name="submit" type="submit" onclick="Login.jsp">Logout</button> -->
         
           
           </form>
        </div>
      
      </div>
       
      <div class="col-lg-3"></div>
   </div>
 </div>

</body>
</html>