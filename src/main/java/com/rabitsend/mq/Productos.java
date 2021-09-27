package com.rabitsend.mq;


public class Productos {

	
	
	
	
	
	private String nombreProducto;
	
	
	private Integer precioProducto;

	
	public Productos(String nombreProducto, Integer precioProducto) {
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}

	

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Integer getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(Integer precioProducto) {
		this.precioProducto = precioProducto;
	}
	
	
}
