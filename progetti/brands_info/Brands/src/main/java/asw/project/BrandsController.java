package asw.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BrandsController {

	@Value("${brandsinfo.famous.uri}") 
	private String famousUri;

	@Value("${brandsinfo.sales.uri}") 
	private String salesUri;
	
	@RequestMapping("/S/{parametro1}")
	public String getInfo(@PathVariable String parametro1) {
		String sentence =
				parametro1 + " è famosa/o per le " +
						getFamous(parametro1) + " ed il record di fatturato annuo è di " + 
						getSales(parametro1) + " di euro.";
		return sentence; 
	}
	@RequestMapping("/S/{parametro1}/{parametro2}")
	public String getInfo(@PathVariable String parametro1, @PathVariable String parametro2) {
		String sentence =  
				parametro1 + " è famosa/o per le " +
						getFamous(parametro1) + " e nell'anno " + parametro2 + 
						" ha fatturato " + getSales(parametro1, parametro2) + " di euro.";
		return sentence; 
	}
	
	private String getWords(String uri, String key) {
		return new RestTemplate().getForObject(uri + "/" + key,String.class);
	}
	private String getWords(String uri, String key1, String key2) {
		return new RestTemplate().getForObject(uri + "/" + key1 + "/" + key2 ,String.class);
	}
	
	// se utilizzi i profili scommenta questo blocco
	/**
	private String getFamous() {
		return getWords(famousUri);
	}	
	private String getSales() {
		return getWords(salesUri);
	}
	private String getWords(String uri) {
		return new RestTemplate().getForObject(uri,String.class);
	}
	**/
	
	private String getFamous(String key) {
		return getWords(famousUri, key);
	}	
	private String getSales(String key) {
		return getWords(salesUri, key);
	}
	private String getSales(String key1, String key2) {
		return getWords(salesUri, key1, key2);
	}
	
}
