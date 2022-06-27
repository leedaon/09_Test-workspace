package com.kh.test.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.test.member.model.vo.Member;

@Controller
public class MemberController {
	
	/** alt + shift + j
	 * 
	 * 로그인 처리를 해주는 메소드 - 다온
	 * @param m => 로그인할 사용자의 계정 (아이디, 비번)
	 * @return => 메인페이지로 url 재요청
	 */
	
	// 협업할때 주석 필수
	@RequestMapping("login.me")
	public String loginMember(Member m) {
		return "redirect:/";
	}

	
}
