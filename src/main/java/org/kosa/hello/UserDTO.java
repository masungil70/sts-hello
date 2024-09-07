package org.kosa.hello;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserDTO {
	private String uid;
	private String pwd;
	private String name;
	private int age;
	private LocalDate birthday; //LocalDateFormatter�� ����Ͽ� ó����  
}
