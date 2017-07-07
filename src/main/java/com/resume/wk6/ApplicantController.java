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
public class ApplicantController {

	@Autowired
	private ApplicantRepository applicantRepository;

	
	@RequestMapping("/applist")
	public String appsSubmitForm(Model model){
		model.addAttribute("appls", applicantRepository.findAll());
		return "resumeOutHTML";
	}
	
	@GetMapping("/app")
	public String addNewApp(Model model){
		model.addAttribute("appl", new Applicant());
		return "applInHTML";
	}
	
	@PostMapping("/app")
	public String processApp(@Valid Applicant appl, BindingResult bindingResult) {
	if (bindingResult.hasErrors()) {
		return "applInHTML";
	}
		applicantRepository.save(appl);
		return "redirect:/resumes/applist";
	}
}
