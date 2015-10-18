package com.zishan.spring;

import java.util.HashMap;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @since 27 Sep 2015
 * @author ZISHAN MOHSIN
 * @summary Controller of rest service.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

	/**
	 * @summary Increment given value passed as parameter.
	 * @param value
	 * @return String
	 */
	@Cacheable(value="firstCache", key="#initialValue")
	@RequestMapping(value = "/returnIncrementedValue", method = RequestMethod.POST, produces = "application/json")
	public HashMap<String, String> returnIncrementedValue(@RequestParam(value="initialValue",required=true) int initialValue) {
		initialValue++;
		System.err.println("Incremented value");
		HashMap<String, String> hashMap=new HashMap<String, String>(1);
		hashMap.put("incrementedValue", initialValue+"");
		return hashMap;
	}
	
	/**
	 * @summary Updated cache value with key as initialValue
	 * @param currentValue
	 * @param newValue
	 * @return String
	 */
	@CachePut(value="firstCache", key="#initialValue")
	@RequestMapping(value = "/updateCachedValue", method = RequestMethod.POST, produces = "application/json")
	public HashMap<String, String> updateCachedValue(@RequestParam(value="initialValue",required=true) int initialValue,
			@RequestParam(value="newValue", required=true) int newValue) {
		System.err.println("Updated value");
		HashMap<String, String> hashMap=new HashMap<String, String>(1);
		hashMap.put("incrementedValue", newValue+"");
		return hashMap;
	}
	
}
