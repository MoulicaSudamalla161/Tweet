<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Post Tweet</title>
<link rel="stylesheet" href="Style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="header">
		&nbsp; tweet 
		<img src="images/logo.png" class="logo"></img>
			<a href="ViewTweet" class="post-link"> View</a> 
 			<a href="ViewAllTweets" class="view-link"> View All</a> 
 			  <!--   <div class="form-group" id="outbutton"> -->
       <!--  <input   name="submit" type="submit" value="logout" onclick="/Login.jsp/"/> -->
           
            <button  name="submit" type="submit" class="buttonalign" >
           <a href="Login.jsp">Logout</a>
           </button>  
          <!--  </div> -->
 				
    </div>
 <div id="ui1">
  <form action="Post" class="form-group" method="post">
   <div class = "container"  >
	  
	   <div class="row">
	       <img src="images/social.png" class="imagealign" >
	   </div> <br> <br> 
	   <div class="row">
	     <textarea id="post" name="post" rows="5" cols="54" ></textarea>
	   </div>
	   <br>
	   <div id="postbutton" >
	    <button class="btn btn-primary btn-lock btn-lg "  name="submit" type="submit"  >Post</button>
	   </div>
	 </div> 
	 </form> 
</div>
</body>
</html>