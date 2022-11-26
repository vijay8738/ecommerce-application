package com.vijaytech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table
public class Product {

	@Id
	private Integer productID;

	@Column(name = "product_Code")
	private String productCode;

	@Column(name = "name")
	private String name;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "price")
	private float price;

	@Column(name = "description")
	private String description;

}
