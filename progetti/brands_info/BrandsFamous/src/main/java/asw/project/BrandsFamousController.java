package asw.project;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandsFamousController {

	private HashMap<String,String> famousFor;
	private String[] keys;
	
	@PostConstruct
	public void init(){
		this.keys = new String[]{"levis","adidas","lacoste"};
		this.famousFor = new HashMap<>();
		this.famousFor.put(keys[0], "jeans");
		this.famousFor.put(keys[1], "scarpe");
		this.famousFor.put(keys[2], "polo");
	}
	@RequestMapping("/S1/")
	public String getWord() {
		int random = ThreadLocalRandom.current().nextInt(0, 3);
		return this.famousFor.get(this.keys[random].toLowerCase());
	}
	@RequestMapping("/S1/{key}")
	public String getWord(@PathVariable String key) {
		if(this.famousFor.get(key.toLowerCase()) == null)
			return getWord();
		return this.famousFor.get(key.toLowerCase());
	}	
}
