package com.wine.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wine.web.entity.WineEntity;
import com.wine.web.wineservice.WineService;


@Controller
public class HomeController {
	
	@Autowired
	private WineService wineService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/serch")
	public String serch(Model model) {
		
		
		List<WineEntity> list = wineService.getList();
		
		model.addAttribute("list", list);
		return "SerchList";
	}
}
