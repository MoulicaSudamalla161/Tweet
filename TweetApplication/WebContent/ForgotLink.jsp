<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset Password</title>
</head>
<body>
    <div id="ui2" >
    <form action="ForgotLink" class="form-group" method="post">
    <p>${forgot}</p>
        <input type="text" name="email" class="form-control"  placeholder="Enter your E-Mail">
        <div class="form-group" id="loginbutton"> <!-- Submit button -->
        <button class="btn btn-primary btn-lock btn-lg "  name="submit" type="submit" >Enter</button>
      </div>
   
    </form>
     </div>
</body>
</html>