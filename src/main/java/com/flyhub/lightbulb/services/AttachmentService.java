package com.flyhub.lightbulb.services;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.flyhub.lightbulb.models.Attachment;
import com.flyhub.lightbulb.repository.AttachmentRepository;

@Service
public class AttachmentService {
	
	@Autowired
	private AttachmentRepository attachmentRepository;
	
	public List<Attachment> getAllAttachments(){
		
		return attachmentRepository.findAll();
	}
	
	public Attachment addAttachment(@RequestParam("attachment") MultipartFile multipartFile, Attachment attachment, String ideaId)
			throws IOException {
				
				String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
				attachment.setIdeaId(ideaId);
				attachment.setAttachmentName(fileName);
				attachment.setFileSize(multipartFile.getSize());
				attachment.setContent(multipartFile.getBytes());
				attachment.setCreatedDate(Calendar.getInstance().getTime());
				
				return attachmentRepository.save(attachment);
	}
	
	public Optional<Attachment> getAttachmentById(Integer attachmentId) {
		
		return attachmentRepository.findById(attachmentId);
	}
	
	public void deleteAttachment(Integer attachmentId) {
		
		attachmentRepository.deleteById(attachmentId);
	}

}
