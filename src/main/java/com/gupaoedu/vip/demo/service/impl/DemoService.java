package com.gupaoedu.vip.demo.service.impl;


import com.gupaoedu.vip.demo.service.IDemoService;
import com.gupaoedu.vip.spring.annotation.Service;

/**
 *
 */
@Service
public class DemoService implements IDemoService {

	/**
	 * get
	 * @param name name
	 * @return String
	 */
	public String get(String name) {
		return "My name is " + name;
	}

}
