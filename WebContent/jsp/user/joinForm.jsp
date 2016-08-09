<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입 창</title>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
    function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var fullAddr = ''; // 최종 주소 변수
                var extraAddr = ''; // 조합형 주소 변수

                // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    fullAddr = data.roadAddress;

                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    fullAddr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 조합한다.
                if(data.userSelectedType === 'R'){
                    //법정동명이 있을 경우 추가한다.
                    if(data.bname !== ''){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있을 경우 추가한다.
                    if(data.buildingName !== ''){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('postcode').value = data.zonecode; //5자리 새우편번호 사용
                document.getElementById('address1').value = fullAddr;

                // 커서를 상세주소 필드로 이동한다.
                document.getElementById('address2').focus();
            }
        }).open();
    }
</script>
</head>

<body>
<div class="margin" style="height:80px">
</div>
<form action="join.action" method="post">
<table border="1">
	<tr>
		<td>ID</td>
		<td><input type ="text" name ="id" value="1">
		<input type ="button" onClick = "confirmOverlab" value="ID check"></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type ="password" name ="password" value="2"></td>
	</tr>
	<tr>
		<td>Password confirm</td>
		<td><input type ="password" name ="confirmPassword" value="3"></td>
	</tr>
	<tr>
		<td>Password Q</td>
		<td><input type ="type" name ="pwdQuestion" value="5"></td>
	</tr>
	<tr>
		<td>Password P</td>
		<td><input type ="type" name ="pwdAnswer" value="5"></td>
	</tr>
	<tr>
		<td>Name</td>
		<td><input type ="text" name ="name" value="6"></td>
	</tr>
	<tr>
		<td>Address</td>
		<td><input type="text" name="postcode" id="postcode" placeholder="PostCode">
		<input type="button" onclick="execDaumPostcode()" value="Search"><br>
		<input type="text" name="address1" id="address1" placeholder="Address">
		<input type="text" name="address2" id="address2" placeholder="Detail Address">
		</td>
	</tr>
	<tr>
		<td>Phone</td>
		<td><input size="5" type ="text" name ="phone1" value="010">-<input type ="text" name ="phone2" value="1">-
		<input type ="text" name ="phone3" value="1"></td>
	</tr>
	<tr>
		<td>E-mail</td>
		<td><input type ="text" name ="email1" value="1">@<input type ="text" name ="email2" value="1"></td>
	</tr>
	
	<tr align ="center">
		<td colspan="2"><input type ="submit" name ="join" value="Join">
		<input type="button" value="Cancel" onclick="location.href='loginForm.action'"></td>
	</tr>
</table>
</form>
</body>
</html>