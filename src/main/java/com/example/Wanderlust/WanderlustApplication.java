package com.example.Wanderlust;

import com.example.Wanderlust.utils.Init;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WanderlustApplication {

	public static void main(String[] args) {
		Init.populateAllTables();
		SpringApplication.run(WanderlustApplication.class, args);
	}

}
