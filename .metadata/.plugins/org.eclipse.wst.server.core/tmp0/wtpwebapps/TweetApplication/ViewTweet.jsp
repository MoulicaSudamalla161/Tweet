<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Tweet</title>
<link rel="stylesheet" type="text/css" href="Style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body id="tweetimage">
    <div class="header">
		    &nbsp; tweet 
		    <img src="images/logo.png" class="logo"></img>
			<a href="Post.jsp" class="post-link"> Post</a> 
 			<a href="ViewAllTweets" class="view-link"> View All</a> 
 			
       <!--  <input   name="submit" type="submit" value="logout" onclick="/Login.jsp/"/> -->
           <button  name="submit" type="submit"  class="buttonalign">
           <a href="Login.jsp">Logout</a>
           </button> 
 				
    </div>

  <div id="ui3">
  
		<table>
			<tbody>
				<tr>
					<th class="tweet-align"><label for="Price"> Tweet </label></th>
					
				</tr>
				    <c:forEach var="tweet" items="${tweetsList}">
				<tr>
					<td class="tweet-align-td">${tweet.tweet}</td>
	
				</tr>
				   </c:forEach> 
				
			</tbody>
		</table>
	</div>


</body>
</html>