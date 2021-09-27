package com.rabitsend.mq;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ConecctionSend {
	
	private final String QUEUE_NAME = "chat";
	
	public void conecctionSend(List<Productos> productos) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
             channel.queueDeclare(QUEUE_NAME, false, false, false, null);
             
             ObjectMapper mapper = new ObjectMapper();
             
             String json = mapper.writeValueAsString(productos);

             
             //casos.getBytes(StandardCharsets.UTF_8)
             channel.basicPublish("", QUEUE_NAME, null, json.getBytes(StandardCharsets.UTF_8));
             System.out.println("Mensaje enviado con exito...");
        }
	}
	
	
	
	
	
}
