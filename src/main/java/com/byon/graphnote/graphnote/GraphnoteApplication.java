package com.byon.graphnote.graphnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GraphnoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphnoteApplication.class, args);
	}

}
