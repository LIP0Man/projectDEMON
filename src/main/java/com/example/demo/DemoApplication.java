package com.example.demo;

import net.minidev.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

class Client {
	private int id;
	private int name;


	public Client(int id, String name) {
		this.id = id;
		this.name = Integer.parseInt(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(String name) {
		this.name = Integer.parseInt(name);
	}
}

@SpringBootApplication
@RestController

public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/post")
	public JSONObject ok(@RequestBody Client client) throws InterruptedException {
		JSONObject json_response = new JSONObject();

		int name = client.getId();
		int id = client.getId();

		json_response.put("id", id);
		json_response.put("name", name);

		return json_response;
	}
}