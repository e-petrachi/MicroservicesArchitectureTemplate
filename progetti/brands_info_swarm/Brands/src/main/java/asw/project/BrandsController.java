package asw.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandsController {

	@Autowired 
	private BrandsService brandsService;
	
	@RequestMapping("/S/{parametro1}")
	public String getInfo(@PathVariable String parametro1) {
		String sentence =
				parametro1 + " è famosa/o per le " +
						brandsService.getFamous(parametro1) + " ed il record di fatturato annuo è di " + 
						brandsService.getSales(parametro1) + " di euro.";
		return sentence; 
	}
	@RequestMapping("/S/{parametro1}/{parametro2}")
	public String getInfo(@PathVariable String parametro1, 
							@PathVariable String parametro2) {
		String sentence =  
				parametro1 + " è famosa/o per le " +
						brandsService.getFamous(parametro1) + " e nell'anno " + parametro2 + 
						" ha fatturato " + brandsService.getSales(parametro1, parametro2) + " di euro.";
		return sentence; 
	}
	
}
