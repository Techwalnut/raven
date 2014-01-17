package com.raven.inc;

import java.util.HashMap;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.raven.inc.vo.RavenUserVO;


public class RavenRestaurantTest {
	
	@Test
	public void testData()
	{
		RestTemplate restTemplate=new RestTemplate();
		RavenUserVO ravenUserVO=new RavenUserVO();
		ravenUserVO.setFirstName("Nitin");
		ravenUserVO.setMiddleName("B");
		ravenUserVO.setLastName("Gondule");
		
		
		//HashMap<String, Object> hashMap = new HashMap<String, Object>();
		//hashMap.put("id", "0jjjj");
		//String result = restTemplate.getForObject("http://localhost:8080/raven-web/restaurant/findVenuByLatLong?latLong=42.98758759825106,-71.50742411613464",String.class);
		RavenUserVO result = restTemplate.
		postForObject("http://localhost:8080/raven-web/ravenusercontroller/savefbuser",ravenUserVO,RavenUserVO.class);

		System.out.println("Result"+result);
	}
	
	//@Test
    public void TestFileUpload() {

            RestTemplate template = new RestTemplate();

            ResponseEntity<String> entity = null;
            
            MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
            
            
            parts.add("id", "ooikjjkjk" );

            entity = template.postForEntity("http://localhost:8080/raven-web/ravenusercontroller/savefbuser",
            		parts, String.class);
    
            System.out.println("Response Status" + entity.getStatusCode());
            System.out.println("Response Message " + entity.getBody());
            //System.out.println("Response " + entity.getBody().getResult().toString());
    }
	
	
	
	
	
}
