package com.example.demo.uss.domain;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "user_no")
	private long userNo;

	@Column(name = "userid")
	private String userid;

	@Column(name = "passwd")
	private String passwd;

	@Column(name = "username")
	private String username;

	@Column(name = "email")
	private String email;

}
