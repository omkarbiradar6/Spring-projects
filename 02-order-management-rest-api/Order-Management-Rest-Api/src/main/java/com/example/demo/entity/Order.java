package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="orders")
public class Order 
{

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	
	private Integer orderId;
	
	@Column(name="cname")
	private String customerName;
	
	@Column(name="proname")
	private String productName;
	
	@Column(name="proqty")
	private Integer  quantity;

	@Column(name="prostatus")
	private String status;
	
	
	
	
	
}
