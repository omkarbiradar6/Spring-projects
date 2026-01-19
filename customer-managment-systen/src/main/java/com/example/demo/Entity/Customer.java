package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customer1")
public class Customer {

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private Integer customerId;
	
	@Column(name="cname")
	private String customerName;
	
	@Column(name="cstatus")
	private String customerStatus;
	
}
