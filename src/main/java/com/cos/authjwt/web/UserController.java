package com.cos.authjwt.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.authjwt.domain.user.User;
import com.cos.authjwt.web.dto.CMRespDto;

@RestController // 데이터만 리턴한다.
public class UserController {
	
	@Autowired
	private HttpSession session;
	
	@GetMapping("/user")
	public ResponseEntity<?> userinfo() {
		System.out.println("userinfo 호출됨");
		User user = new User(1, "ssar", null, "ssar@nate.com", "GUEST");
		return new ResponseEntity<>(new CMRespDto<User>(1, "success", user), HttpStatus.OK);
	}

}
