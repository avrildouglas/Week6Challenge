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
@RequestMapping(path="/resumes")
public class ExperienceController {

	@Autowired
	private ExperienceRepository experienceRepository;
	
	@RequestMapping("/exp")
	public String expeSubmitForm(Model model){
		model.addAttribute("expes", experienceRepository.findAll());
		return "resumeOutHTM";
	}
		
	@GetMapping("/exp")
	public String addNewExp(Model model){
		model.addAttribute("expe", new Experience());
		return "expeInHTML";
	}

	@PostMapping("/exp")
	public String processExp(@Valid Experience expe, BindingResult bindingResult) {
	if (bindingResult.hasErrors()) {
		return "expeInHTML";
	}
		experienceRepository.save(expe);
		return "redirect:/resumes/list";
	}
}
