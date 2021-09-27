package com.rabitsend.mq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SendMain {
	
	public static void main(String[] args) {
		
		List<Productos> listaProductos = generarProductos();
		ConecctionSend conecctionSend = new ConecctionSend();
			try {
				conecctionSend.conecctionSend(listaProductos);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	public static List<Productos> generarProductos(){
		
		int incremento = 100;
		int finalContador = incremento * 2;
		List<String> nombreProductos = Arrays.asList("Play 2", "Play 3", "Play 4", 
				 "play 5", "Nintendo DS", "Ipad 4", 
				 "Iphone 13", "Iphone 13 plus");
		List<String> colorProducto = Arrays.asList("Negro", "Blanco", "Gris", "Dorado", "Amarillo", "Rojo");
		List<Productos> listaProductos = new ArrayList<>();
		
		int min = 500000;
	    int max = 4000000;
		
		while(incremento <= finalContador) {
			Collections.shuffle(nombreProductos);
			Collections.shuffle(colorProducto);
			String nProducto = nombreProductos.get(0);
			String cProductos = colorProducto.get(0);
			String producMasColor = nProducto + " " + cProductos;
			int precioProducto = (int)Math.floor(Math.random()*(max-min+1)+min);
			Productos producto = new Productos(producMasColor, precioProducto);
			listaProductos.add(producto);
			incremento++;
		}
		
		return listaProductos;

	}
}
