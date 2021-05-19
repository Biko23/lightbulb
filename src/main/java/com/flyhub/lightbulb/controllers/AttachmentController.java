package com.flyhub.lightbulb.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.flyhub.lightbulb.models.Attachment;
import com.flyhub.lightbulb.services.AttachmentService;

@Controller
public class AttachmentController {
	
//	@Autowired
//	private AttachmentService attachmentService;
//	
//	
//	@GetMapping("/add_attachment")
//	public String addAttachmentForm(Attachment attachment, Model model) {
//		
//		model.addAttribute("attachment", attachment);
//		
//		return "add_attachment";
//		
//	}
//	@PostMapping("/add_attachment")
//	public String attachFile(@RequestParam("attachment") MultipartFile multipartFile, Attachment attachment)
//			throws IOException {
//		
//		attachmentService.addAttachment(multipartFile, attachment);
//		
//		return "redirect:idea_home";
//	}

}
