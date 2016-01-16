package org.techzoo.springtiles.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.techzoo.springtiles.vo.Person;

@Controller
public class SpringTilesController {

//	@RequestMapping(value="index")
//	public String index() {
//		return "index";
//	}
	

	@RequestMapping(value="index")
	public ModelAndView index(Model model) {
		
		Map<String, List<Map<String,String>>> data = new HashMap<String, List<Map<String,String>>>();
		
		List<Map<String,String>> persons = new ArrayList<Map<String,String>>();
	
		Map<String,String> values1 = new HashMap<String,String>();
		values1.put("name", "AAAA");
		values1.put("email", "AAAA@AAA");
		values1.put("age", "AA");
		persons.add(values1);
		
		data.put("persons", persons);
		
		return new ModelAndView("personList", data);
	}
	
	@RequestMapping(value="viewPeson")
	public ModelAndView viewPersons(Model model) {
		Map<String, List<Person>> persons = new HashMap<String, List<Person>>();
		persons.put("persons", Person.createPersons());
		return new ModelAndView("personList", persons);
	}
}
