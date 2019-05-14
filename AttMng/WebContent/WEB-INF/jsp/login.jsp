<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<title></title>
<style type="text/css">
   #login{
      text-align : left;
      height : 80%;
   }
   #footer{
      text-align : center;
      padding : 10px;
   }
</style>
</head>
<body>
   <jsp:include page="/WEB-INF/common/header.jsp"></jsp:include>
   <br>
      <div id="login">
      <div style="font-family: verdana; padding: 5px; border: 1px solid red; font-size: 25px; text-align: left; height: 80%">
         <h1>ログイン</h1>
         <table style="margin-left: auto; margin-right: auto;"> 
         <tr>
         <td><form:label path="id">ID</form:label>
            <td><input type = "text" id = "m_id" placeholder="ID"></td></td>
           
         </tr>
         <tr>
         <td><form:label path="pw">パスワード</form:label>
             <td><input type = "password" id = "m_pw" placeholder="パスワード"></td></td>
        
        </tr>
        <tr>
        <td style = "margin-left: auto; margin-right: auto;"></td>
            <td><button id = "login_process">ログイン</button>
            <button id = "new_co">新規登録</button></td>
        </tr>         
         </table> 
                
      </div>
      <div id="footer">
         <jsp:include page="/WEB-INF/common/footer.jsp"></jsp:include>
      </div>
      </div>
   
</body>
</html>