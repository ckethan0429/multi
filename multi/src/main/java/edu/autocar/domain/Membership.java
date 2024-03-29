package edu.autocar.domain;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Membership {
	@NotEmpty(message="사용자 ID는 필수 항목입니다.")
	private String userId;
	@NotEmpty(message="비밀번호는 필수 항목입니다.")
	private String password;
	
	private String name;
	private String salt;
	private String email;
	private String phone;
	private String explanation; // 블로그 소개 
	
	private Date regDate;
	private Date updateDate;
	private Date uploadDate;
}
