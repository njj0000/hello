<html>
<head>
<title>gangster eleven</title>

 <script language='javascript'>
 function change(num)
 {
 var x  = document.form;
 var y = Number(x.count.value) + num;
 if(y < 1) y = 23;
 x.count.value = y;
 }
 </script>

</head>
<body>
 <form name='form'>
  <table>
   <tr>
    <td>나이</td>
    <td>
     <table>
      <tr>
       <td><input type='text' name='count' value='1' size='3' readonly><td>
       <td>
        <a href='#' onclick='javascript_:change(1);'>▲</a><br>
        <a href='#' onclick='javascript_:change(-1);'>▼</a>
        <!--버튼을 이미지로 바꾸세요 <img src='이미지경로' onclick='javascript_:change(1);'>-->
       </td>
      </tr>
     </table>
    </td>
   </tr>
  </table> 
 </form>
</body>
</html>