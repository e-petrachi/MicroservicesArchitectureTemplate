package asw.project;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandsSalesController {

	private HashMap<String,String> sales;
	private HashMap<String,String> salesYear;
	private String[] keys;

	@PostConstruct
	public void init(){
		this.keys = new String[]{"levis","adidas","lacoste"};
		this.sales = new HashMap<>();
		this.sales.put(keys[0], "19 miliardi");
		this.sales.put(keys[1], "20 miliardi");
		this.sales.put(keys[2], "21 miliardi");

		this.salesYear = new HashMap<>();
		for(int i=0;i<3;i++){
			boolean finito = false;
			Integer year = 2010;
			while(!finito){
				if(year.intValue()==2016)
					finito=true;
				Integer intero = ThreadLocalRandom.current().nextInt(10, 20);
				this.salesYear.put(keys[i]+year.toString(), intero.toString() + " miliardi");
				year++;
			}
		}
	}

	@RequestMapping("/S2/")
	public String getWord() {
		int random = ThreadLocalRandom.current().nextInt(0, 3);
		return this.sales.get(this.keys[random].toLowerCase());
	}
	@RequestMapping("/S2/{key}")
	public String getWord(@PathVariable String key) {
		if(this.sales.get(key.toLowerCase()) == null){
			return getWord();	
		}
		return this.sales.get(key.toLowerCase());
	}
	
	@RequestMapping("/S2/{key1}/{key2}")
	public String getWord(@PathVariable String key1, @PathVariable String key2){
		if(this.salesYear.get(key1.toLowerCase()+key2) == null){
			return getWord();	
		}
		return this.salesYear.get(key1.toLowerCase()+key2);
	}
}
