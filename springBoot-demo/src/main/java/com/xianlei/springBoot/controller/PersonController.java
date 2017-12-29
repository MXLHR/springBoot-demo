package com.xianlei.springBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xianlei.springBoot.model.Person;

@Controller
public class PersonController {

	@RequestMapping("/person")
	public String person(Model model){
		
		Person single = new Person("zhangSan",18);
		
		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("Lisi",19);
		Person p2 = new Person("wangWu",20);
		Person p3 = new Person("zhaoliu",21);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		model.addAttribute("singlePerson",single);
		model.addAttribute("people",people);
		
		return "index";
	}
}
