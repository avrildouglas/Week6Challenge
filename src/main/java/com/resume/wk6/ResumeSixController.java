package com.resume.wk6;

import org.hibernate.mapping.List;
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
import com.resume.wk6;

import java.time.Instant;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;


@Controller
@RequestMapping(path="/resumes")

public class ResumeSixController {
	
//	Date d = new Date();
//	String formatted = new SimpleDateFormat ("yyyy-MM-dd:HH-mm-ss").format (d);

		@Autowired
		private ResumeSixRepository ressixRepository;

	/**@GetMapping("/login")
	public String login(){
		return "login";
	}*/
		

	@RequestMapping("/list")
	public String postSubmitForm(Model model){
		model.addAttribute("posts", ressixRepository.findAll());
		return "ressixOutHTM";
	}
		
	@GetMapping("/add")
	public String addNewPost(Model model){
		model.addAttribute("post", new Reddit());
		return "postlinkHTML";
	}

	@PostMapping("/add")
	public String processPost(@Valid Reddit post, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "postlinkHTML";
		}
			reddRepository.save(post);
			return "redirect:/posts/list";
	}
	
 	
}
