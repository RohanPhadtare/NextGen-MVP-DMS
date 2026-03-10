package com.project.nextgen.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.nextgen.model.DocumentData;

public interface DocumentRepository extends MongoRepository<DocumentData,String>{

    Optional<DocumentData> findByDocumentId(String documentId);
}
