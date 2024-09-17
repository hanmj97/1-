<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>




<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name ="viewport" content= "width=device-width", initial-scale="1">
<link rel = "stylesheet" href="css/bootstrap.css">
<title>Insert title here</title>
</head>

<body>


 <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">1PM FOR CREATE </a>                  <!-- 네비게이션  글자 .-->
    </div>
    
     </div>                                                                  <!-- 네비게이션 버튼 .-->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="main.jsp">메인화면</a></li>
                 <li><a href="main.jsp">자유게시판</a></li>
                  <li><a href="main.jsp">중고거래</a></li>
                   <li><a href="main.jsp">초보자 가이드</a></li>
                    </ul>  
                    
                    
           </div>   <!-- 점보트론, 이미지 파일 삽입 -->
           
           <style type = "text/css">                               
           .jumbotron{
           background-image: url('image/blue.jpg');
           background-size: cover;
           text-shadow: black 0.2em 0.2em 0.2em;
           color: white;
           
           }
           
           </style>
                                             <!-- 점보트론 제목,소제목,텍스트, 버튼삽입  -->
           
           
           <section class = "main">
           <div class = "jumbotron">
           <div class = "container">
           <h1>COMMUNITY</h1>
           <p> FOR CREATORS </p>
           <p><a class = "btn btn-primary btn-lg" href = "#"
           role = "button"> More about >></a></p>
           </div>
       
           </div>
         </section>    
                                       <!-- 점보트론, 이미지 파일 삽입 -->
           <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
  <div class="panel panel-default">
    <div class="panel-heading" role="tab" id="headingOne">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
          FOR WHAT?
        </a>
      </h4>
    </div>
    <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
      <div class="panel-body">
        내용
      </div>
    </div>
  </div>
  <div class="panel panel-default">
    <div class="panel-heading" role="tab" id="headingTwo">
      <h4 class="panel-title">
        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
          WHY?
        </a>
      </h4>
    </div>
    <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
      <div class="panel-body">
       내용
      </div>
    </div>
  </div>
  <div class="panel panel-default">
    <div class="panel-heading" role="tab" id="headingThree">
      <h4 class="panel-title">
        <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
          WHAT SHOULD I DO
        </a>
      </h4>
    </div>
    <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
      <div class="panel-body">
        내용.
      </div>
    </div>
  </div>
</div>
           
            <!-- 썸네일, 버튼   -->
           
           <article class = "photo container">
      <div class="row">
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="image\picture.png" alt="picture">
      <div class="caption">
        <h3>썸네일</h3>
        <p>...</p>
        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
      </div>
    </div>
  </div>
</div>



  </article>

 <!-- footer -->

<footer style="background-color: #000000; color: #ffffff">
        <div class="container">
            <br>
            <div class="row">
                <div class="col-sm-2" style="text-align: center;">
                    <h5>Copyright &copy; 2019</h5><h5>1FC(1PM FOR CREATE)</h5> </div>
                <div class="col-sm-4">
                    <h4> 홈페이지 소개                                            
                    <br><br>
                    <p>....... 
                        <br>.... 
                    </p>
                    </h4></div>
               
               
                <div class="col-sm-2"><h4 style="text-align: center;">
                    <span class="glyphicon glyphicon-ok"></span>&nbsp; by 7</h4></div>
            </div>
        </div>    
 
    </footer>
    <!-- 외부에서 자바스트립을 참조 하겠음 -->
    <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.js"></script>


   
</nav>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.js"></script>
</body>
</html>
