package org.sk.ms.probes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.availability.ApplicationAvailabilityBean;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.availability.ReadinessState;

@SpringBootApplication
public class ProbesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProbesDemoApplication.class, args);
	}

}
