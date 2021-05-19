package com.flyhub.lightbulb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flyhub.lightbulb.models.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
	
	@Query("SELECT new Attachment(a.attachmentId, a.attachmentName, a.fileSize, a.ideaId) FROM Attachment a ORDER BY a.createdDate DESC")
	List<Attachment> findAll();

}
