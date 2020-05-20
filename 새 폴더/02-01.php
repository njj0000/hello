   




<!DOCTYPE html>


<html>


<head>


<meta charset="UTF-8">


<title>성적처리 결과</title>
<%


  String name = request.getParameter("name");   


 int kor = Integer.parseInt(request.getParameter("kor"));


  int eng = Integer.parseInt(request.getParameter("eng"));


    int math = Integer.parseInt(request.getParameter("math"));



 int tot = kor + eng + math;


   double avg = (tot * 100) / 3 / 100.0 ;


   String grade= "";





   if (avg>=90){


        grade = "A";


    }else if(avg >= 80){


     grade = "B";


    }else if(avg >= 70){


        grade = "C";


    }else if(avg >= 60){


      grade = "D";


   }else if(avg < 60){


       grade = "F";


    } 

%>



</head>


<body>


<form>
   <h1 >성적 판정 결과 시스템</h1>
 


       

<form>
   <h1 >성적 판정 결과 시스템</h1>
 
<h2>성적처리 결과</h2>


       <ul>


        <li>이름  : <%=name %></li>


         <li>국어 : <%=kor %></li>


         <li>영어  : <%=eng %></li>


            <li>수학  : <%=math %></li>


         <li>총점 : <%=tot %></li>


          <li>평균 : <%=avg %></li>


           <li>등급 : <%=grade %></li>


      </ul


</form>






</body>


</html>
