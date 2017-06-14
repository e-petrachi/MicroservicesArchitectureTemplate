package asw.project.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("brands-sales")
public interface SalesClient {
	
	@RequestMapping(value="/S2/{key}", method=RequestMethod.GET)
	public String getRevenue(@PathVariable(value = "key") String key1);
	
	@RequestMapping(value="/S2/{key1}/{key2}", method=RequestMethod.GET)
	public String getRevenue(@PathVariable(value = "key1") String key1, @PathVariable(value = "key2") String key2);

}
