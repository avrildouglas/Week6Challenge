package com.resume.wk6;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.resume.wk6.Applicant;
import com.resume.wk6.Education;
import com.resume.wk6.Experience;
import com.resume.wk6.Skill;


@Controller
@RequestMapping(path="/resumes")

public class SkillController {
	
//	Date d = new Date();
//	String formatted = new SimpleDateFormat ("yyyy-MM-dd:HH-mm-ss").format (d);

		@Autowired
		private SkillRepository skillRepository;
		

	/**@GetMapping("/login")
	public String login(){
		return "login";
	}*/

	@RequestMapping("/ski")
	public String skilSubmitForm(Model model){
		model.addAttribute("skils", skillRepository.findAll());
		return "resumeOutHTM";
	}
		
	@GetMapping("/ski")
	public String addNewSki(Model model){
		model.addAttribute("skil", new Skill());
		return "skilInHTML";
	}
		
	@PostMapping("/ski")
	public String processSki(@Valid Skill skil, BindingResult bindingResult) {
	if (bindingResult.hasErrors()) {
		return "skilInHTML";
	}
		skillRepository.save(skil);
		return "redirect:/resumes/list";
	}	
}
