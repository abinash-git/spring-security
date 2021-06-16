package com.neosoft.main.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long student_id;

	@NotNull(message = "First Name cannot be null")
	@NotBlank
	@Size(min = 3, max = 15, message = "Fist name must be between 3 and 15 characters")
	private String firstName;

	@NotNull
	@Size(min = 3, max = 15, message = "Last name must be between 3 and 15 characters")
	private String lastName;

	@NotBlank
	@NotNull(message = "Mobile must not be null")
	@Size(min = 10, max = 10, message = "Mobile number should be 10 digit")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String mobile;

	@NotBlank(message = "Email should not be blank")
	@Email(message = "Email should be valid")
	private String email;

	@OneToMany(mappedBy = "id", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Project> project;
	private String photo;

}
