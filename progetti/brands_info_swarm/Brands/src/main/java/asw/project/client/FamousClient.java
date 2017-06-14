package asw.project.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("brands-famous")
public interface FamousClient {

	@RequestMapping(value="/S1/{key}", method=RequestMethod.GET)
	public String getProduct(@PathVariable(value = "key") String key);

}
