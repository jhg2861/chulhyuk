<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<script src="resources/script/memberValidation.js"></script>
</head>
<body>
<div class="wrapper">
	<h2>[ 회원가입!!! ]</h2>
	<form id="join" action="join" method="POST">
		<table border="1">
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" id="userid" name="userid">
					<input type="button" value ="ID 중복확인"> 
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" id="userpwd" name="userpwd">
				</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>
					<input type="text" id="username" name ="username">
				</td>
			</tr>
			<tr>
				<th>Email</th>
				<td>
					<input type="email" id="email" name="email">
				</td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td>
					<input type="date" id="birth" name="birth">
				</td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<input type="radio" id="gender" name="gender" value="남자" checked>남자
					<input type="radio" id="gender" name="gender" value="여자">여자
				</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>
					<select id="phone1">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="019">019</option>
						<option value="018">018</option>
					</select>
					<input type="text" id="phone2" placeholder="-없이 숫자만 입력">
					<input type="hidden" id="phone" name="phone" value="" >
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="회원가입" onclick="return memberCheck();" >
					<input type="reset"  value="지우기">
				</th>
			</tr>
		</table>
	</form>
</div>
</body>
</html>
