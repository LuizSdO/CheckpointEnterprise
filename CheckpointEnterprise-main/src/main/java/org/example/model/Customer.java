package org.example.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;

	@Column(name = "age")
	private int age;

	@Column(name = "card_information")
	private String info;

	@Column(name = "IP_address")
	private String ip;

	@Column(name = "device")
	private String device;

	@OneToMany(mappedBy = "customer")
	private List<Purchase> purchases;
}