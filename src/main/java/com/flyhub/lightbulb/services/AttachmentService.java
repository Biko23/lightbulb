package com.flyhub.lightbulb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.flyhub.lightbulb.models.Attachment;
import com.flyhub.lightbulb.repository.AttachmentRepository;

@Service
public class AttachmentService {
	
	@Autowired
	private AttachmentRepository attachmentRepository;
	
	public List<Attachment> getAllAttachments(){
		
		return attachmentRepository.findAll();
	}
	
	public Attachment addAttachment(Attachment attachment) {
		
		return attachmentRepository.save(attachment);
	}
	
	public Optional<Attachment> getAttachmentById(Integer attachmentId) {
		
		return attachmentRepository.findById(attachmentId);
	}
	
	public void deleteAttachment(Integer attachmentId) {
		
		attachmentRepository.deleteById(attachmentId);
	}

}
