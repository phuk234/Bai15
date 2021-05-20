package com.se.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.se.entity.RiversideCar;

import com.se.service.RiversideCarService;




@Controller
public class HomeController {
	
	@Autowired
    private RiversideCarService bookservice;	
	
	
@RequestMapping("/listproduct")
public String test(Model theModel){
	List<RiversideCar> kq=bookservice.getRiversideCar();
	
	theModel.addAttribute("books",kq);
return "list-product";	
}
@RequestMapping("/sort")
public String test2(Model theModel){
	List<RiversideCar> kq=bookservice.sortRiversideCar();
	
	theModel.addAttribute("bookss",kq);
return "sort";	
}
@GetMapping("/delete")
public String deleteBook(@RequestParam("bookid") int id) {

  
        bookservice.deleteRiversideCar(id);

        return "redirect:/listproduct";
}
@GetMapping("/add")
public String addBook(Model model) {
model.addAttribute("book",new RiversideCar());
        return "add";
}


@RequestMapping(value = "/save", method = RequestMethod.POST)
public String saveBook(@ModelAttribute("book") RiversideCar book) {
	bookservice.addRiversideCar(book);
  return "redirect:/listproduct";
}

@RequestMapping(value = "/search")
public String searchBook(@RequestParam("searchString") String check,Model theModel) {

	List<RiversideCar> kq=bookservice.searchRiversideCar(check);
	theModel.addAttribute("searchbooks",kq);
  return "search";
}

}
