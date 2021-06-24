package com.cos.authjwt.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.authjwt.domain.user.User;

@RestController // 데이터만 리턴한다.
public class UserController {
	
	@Autowired
	private HttpSession session;
	
	@GetMapping("/user")
	public void userinfo() {
		User principal = (User)session.getAttribute("principal");
		System.out.println("로그인된 사용자 "+principal);
	}
}
