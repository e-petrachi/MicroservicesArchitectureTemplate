package asw.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient 
public class BrandsSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrandsSalesApplication.class, args);
	}
}
