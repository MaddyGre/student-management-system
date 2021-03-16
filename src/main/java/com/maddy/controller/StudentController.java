package com.maddy.controller;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
=======
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
>>>>>>> b4bf349 (Uploading the latest working version with validation included)
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maddy.entity.Student;
import com.maddy.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Student> listStudents = service.listAll();
		model.addAttribute("listStudents", listStudents);
<<<<<<< HEAD
		
		
=======
			
>>>>>>> b4bf349 (Uploading the latest working version with validation included)
		return "index";
	}
	
	@RequestMapping("/new")
	public String showStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		
		return "new_student";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
<<<<<<< HEAD
	public String saveStudent(@ModelAttribute("student") Student student) {
		service.save(student);
		
		return "redirect:/";
=======
	public String saveStudent(@Valid @ModelAttribute("student") Student student,
			BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "new_student";
		} else {
			service.save(student);
			return "redirect:/";
		}
			
>>>>>>> b4bf349 (Uploading the latest working version with validation included)
	}
	
	@RequestMapping("/student/edit/{studentId}")
	public ModelAndView editStudent(@PathVariable(name="studentId") int studentId) {
		ModelAndView edit = new ModelAndView("edit_student");
		Student student = service.get(studentId);
		edit.addObject("student", student);
		
		return edit;
		
	}
	
	@RequestMapping("/student/delete/{studentId}")
	public String deleteStudent(@PathVariable(name="studentId") int studentId) {
		service.delete(studentId);
		return "redirect:/";
	}

}
