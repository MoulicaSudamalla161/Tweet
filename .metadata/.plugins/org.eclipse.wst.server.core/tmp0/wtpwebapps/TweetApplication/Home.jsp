<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

<link rel="stylesheet" type="text/css" href="Style.css">
<script src="js/script.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body id="homeimage">
 
   <div class="header">
		&nbsp; tweet 
		<img src="images/logo.png" class="logo"></img>
		 <a href="Post.jsp" class="post-link"> Post</a>
			<a href="ViewTweet" class="view-link"> View</a> 
			<a href="ViewAllTweets" class="viewall-link"> View All</a> 
	</div>
	
	<div class = "container" id="align">
	   <div class="row">
	   <div class="col-lg-6">
	 
	    <p>Twitter is an American microblogging and social networking</p>
	    </div>
	    </div>
	    <div class="row">
	   <div class="col-lg-6">
	    <p>service on which users post and interact with messages</p>
	    </div>
	   </div>
	<div class="row">
	   <div class="col-lg-6">
	    <p>known as "tweets". Registered users can post, like and retweet</p>
	    </div>
	   </div>
	<div class="row">
	   <div class="col-lg-6">
	    <p>tweets, but unregistered users can only read them.</p>
	    </div>
	   
	     
	</div>
	</div>
	      <div class="form-group" id="loginbutton"> 
       <!--  <input   name="submit" type="submit" value="logout" onclick="/Login.jsp/"/> -->
           <button  name="submit" type="submit" >
           <a href="Login.jsp">Logout</a>
           </button> 
      </div>
	
</body>
</html>