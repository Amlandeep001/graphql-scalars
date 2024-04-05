package com.learn.graphqlscalars.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product
{
	@Id
	@GeneratedValue
	Integer id;
	String title;
	Boolean isOnSale;
	Float weight;
	BigDecimal price;
	LocalDateTime dateCreated;

	public Product(String title, Boolean isOnSale, Float weight, BigDecimal price, LocalDateTime dateCreated)
	{
		this.title = title;
		this.isOnSale = isOnSale;
		this.weight = weight;
		this.price = price;
		this.dateCreated = dateCreated;
	}
}
