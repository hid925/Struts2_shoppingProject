<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Heroic Features - Start Bootstrap Template</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/heroic-features.css" rel="stylesheet">
    
    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
<style>
li {
    padding: 20px;
}
li.user { color:white;}
</style>

</head>

<c:catch>
	<c:choose>
		<c:when test="${param.page==null || param.page=='' }">
		<c:set var="pageFile" value="basic.jsp"></c:set></c:when>
		<c:when test="${param.page.equals('basic')}">
		<c:set var="pageFile" value="basic.jsp"></c:set></c:when>
		<c:when test="${param.page.equals('login') }">
		<c:set var="pageFile" value="user/login.jsp"></c:set></c:when>
		<c:when test="${param.page.equals('joinForm') }">
		<c:set var="pageFile" value="user/joinForm.jsp"></c:set></c:when>
		<c:when test="${param.page.equals('logout') }">
		<c:set var="pageFile" value="basic.jsp"></c:set></c:when>
		
		<c:when test="${param.page.equals('productOuterList') }">	
		<c:set var="pageFile" value="product/productList.jsp"></c:set></c:when>
 		<c:when test="${param.page.equals('productTopList') }">	
		<c:set var="pageFile" value="product/productList.jsp"></c:set></c:when>
 		<c:when test="${param.page.equals('productBottomList') }">	
		<c:set var="pageFile" value="product/productList.jsp"></c:set></c:when>
  		<c:when test="${param.page.equals('productAccList') }">	
		<c:set var="pageFile" value="product/productList.jsp"></c:set></c:when> 
		<c:when test="${param.page.equals('productView') }">	
		<c:set var="pageFile" value="product/productView.jsp"></c:set></c:when> 
		
		<c:when test="${param.page.equals('adminList') }">	
		<c:set var="pageFile" value="admin/adminList.jsp"></c:set></c:when> 
		<c:when test="${param.page.equals('adminInsert') }">	
		<c:set var="pageFile" value="admin/adminInsert.jsp"></c:set></c:when> 
		<c:when test="${param.page.equals('adminDetail') }">	
		<c:set var="pageFile" value="admin/adminDetail.jsp"></c:set></c:when> 
	
	
		<c:when test="${param.page.equals('cartView') }">	
		<c:set var="pageFile" value="cart/cartView.jsp"></c:set></c:when>
	
		<c:when test="${param.page.equals('qnaWrite') }">	
		<c:set var="pageFile" value="qna/qnaWrite.jsp"></c:set></c:when>
		<c:when test="${param.page.equals('qnaList') }">	
		<c:set var="pageFile" value="qna/qnaList.jsp"></c:set></c:when>
	
				
	</c:choose>
</c:catch>

<body>
    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp?page=basic"> <img src="image/logo.png" width="70" height="70"></src>  </a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                    	<a href="productOuterList.action">OUTER</a>
                    </li>
                    <li>
                        <a href="productTopList.action">TOP</a>
                    </li>
                    <li>
                        <a href="productBottomList.action">BOTTOM</a>
                    </li>
                    <li>
                        <a href="productAccList.action">ACC</a>
                    </li>             
                 	<li>
                    </li>
                    <li>                        
                    </li>  
                 
				<c:if test="${session.user == null}">
					<li>
                        <a href="index.jsp?page=login">LOGIN</a>
                    </li>
                    <li>
                        <a href="index.jsp?page=joinForm">JOIN</a>
                    </li>
				</c:if>
				
				<c:if test="${session.user != null}">
		      	 	<c:if test="${user.id == 'admin'}">
			      	 	<li>
	                        <a href="adminList.action">ADMIN</a>
	                    </li>    
			      	 	<li>
	                        <a href="logout.action">LOGOUT</a>
	                    </li>
	                    <li>
	                    	<a href="cart.action?userId=${session.user.id }">CART</a>
	                    </li>
	                    <li class = "user">${user.id } WELCOME!	</li>
		      		</c:if>
		      	 
		      		<c:if test="${user.id != 'admin'}">
		      	 	 	<li>
                        <a href="logout.action">LOGOUT</a>
                    	</li>
                    	<li class = "user">${user.id } WELCOME!	</li>
		      	 	</c:if>
		        </c:if>
               
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    
    <div class="container">

        <div class="row">
               <!--  <h3>Latest Features</h3> -->
                <div id="content">
                	<jsp:include page="${pageFile }"/> 
                </div>
       	</div>
        <!-- /.row -->

        <!-- Page Features -->
        <div class="row text-center">

            

        </div>
        <!-- /.row -->

        <hr>

        <!-- Footer -->
        <footer>
        <div class ="row">
        	<div class="col-lg-12">
        	footer
            </div>
        </div>
      
        </footer>

    </div>
    <!-- /.container -->

    

</body>

</html>
