<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="userInsert" method="post">
	<label for="uid"> 아이디 </label>
	<input id="uid" name="uid" type="text" required="required"><br/>
	<label for="pwd"> 비밀번호 </label>
	<input id="pwd" name="pwd" type="password" required="required"><br/>
	<label for="name"> 이름 </label>
	<input id="name" name="name" type="text" required="required"><br/>
	<label for="age"> 나이 </label>
	<input id="age" name="age" type="number" required="required"><br/>
	<label for="birthday"> 생년월일 </label>
	<input id="birthday" name="birthday" type="date" required="required"><br/>
	<input type="submit" value="가입">
</form>
</body>
</html>