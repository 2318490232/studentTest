<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
	<script>
        function showinfo(){
            $.ajax({

url:"Show",
type:"post",
dataType:"json",
contentType: "application/json; charset=utf-8",
success: function(data) {
    $(data).each(function () { 
      $("table:first").append($("<tr>"+
                  "<td>"+this.classRoom+"</td>"+
                  "<td>"+this.name+"</td>"+
                  "<td>"+this.sex+"</td>"+
                  "<td>"+this.age+"</td>"+
              "</tr>"));  
    });
}
});
        }
        $(function(){
        showinfo();	

        });
    </script>
    <table>
        <tr>
            <td>班级</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
        </tr>
    </table>
    
</body>
</html>