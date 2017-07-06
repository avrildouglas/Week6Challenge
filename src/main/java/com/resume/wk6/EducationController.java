package com.resume.wk6;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/resumes/")

public class EducationController {

	@Autowired
	private EducationRepository educationRepository;

	@RequestMapping("/edu")
	public String educSubmitForm(Model model){
		model.addAttribute("educs", educationRepository.findAll());
		return "resumeOutHTM";
	}

	@GetMapping("/edu")
	public String addNewEdu(Model model){
		model.addAttribute("educ", new Education());
		return "educInHTML";
	}
	
	@PostMapping("/edu")
	public String processEdu(@Valid Education educ, BindingResult bindingResult) {
	if (bindingResult.hasErrors()) {
		return "educInHTML";
	}
		educationRepository.save(educ);
		return "redirect:/resumes/list";
	}
}
