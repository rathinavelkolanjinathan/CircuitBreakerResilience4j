package com.javatechie.us.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    public OrderDTO(int id, String name, String category, String color, int price) {
	
    	this.id=id;
    	this.category=category;
    	this.name=name;
    	this.color=color;
    	this.price=price;
    }
    
	private int id;
    private String name;
    private String category;
    private String color;
    private double price;
}
