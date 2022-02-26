package com.elroykanye.junglelms.data.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	@Column(name = "username", nullable = false, unique = true, length = 32)
	private String username;

	@Column(name = "email", nullable = false, unique = true, length = 64)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

}
