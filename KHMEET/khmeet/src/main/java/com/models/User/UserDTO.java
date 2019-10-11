package com.models.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	private Long user_id;
	private String email;
	private Boolean is_confirmed;
	private enum role {admin,user};
	private String password;
	private String image;
	private String nickname;
	private Date birthday;
	private String about;
	private String phone;
}