package asw.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import asw.project.client.FamousClient;
import asw.project.client.SalesClient;

@Service 
public class BrandsService {
	
	@Autowired 
	private FamousClient famousClient;

	@Autowired 
	private SalesClient salesClient;
	
	@HystrixCommand(fallbackMethod="getFallbackFamous")
	public String getFamous(String parametro1) {
		return famousClient.getProduct(parametro1); 
	} 
	
	public String getFallbackFamous(String parametro1) {
		return "nullaFamous"; 
	}
	
	@HystrixCommand(fallbackMethod="getFallbackSales1")
	public String getSales(String parametro1) {
		return salesClient.getRevenue(parametro1); 
	}
	
	@HystrixCommand(fallbackMethod="getFallbackSales2")
	public String getSales(String parametro1, String parametro2) {
		return salesClient.getRevenue(parametro1, parametro2); 
	}
	
	public String getFallbackSales1(String parametro1) {
		return "nullaSales"; 
	}
	public String getFallbackSales2(String parametro1, String parametro2) {
		return "nullaSales"; 
	}
	
}
