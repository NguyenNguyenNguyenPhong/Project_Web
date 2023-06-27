package com.alibou.security.rest;

import com.alibou.security.entity.DocumentCourse;
import com.alibou.security.service.DocumentCourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DocumentRestController {

    private DocumentCourseService documentService;

    public DocumentRestController(DocumentCourseService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/document")
    public List<DocumentCourse> findAll() {
        List<DocumentCourse> documents = documentService.findAll();
        return documents;
    }

    @GetMapping("/document/{documentId}")
    public DocumentCourse getDocumentById(@PathVariable int documentId) {
        DocumentCourse document = documentService.findById(documentId);
        if (document == null) {
            throw new RuntimeException("Document id not found: " + documentId);
        }
        return document;
    }

    @PostMapping("/document")
    public DocumentCourse addDocument(@RequestBody DocumentCourse document) {
        document.setDocumentID(0);
        DocumentCourse dbDocument = documentService.save(document);
        return dbDocument;
    }

    @PutMapping("/document")
    public DocumentCourse updateDocument(@RequestBody DocumentCourse document) {
        DocumentCourse dbDocument = documentService.save(document);
        return dbDocument;
    }

    @DeleteMapping("/document/{documentId}")
    public String deleteDocument(@PathVariable int documentId) {
        DocumentCourse theDocument = documentService.findById(documentId);
        if (theDocument == null) {
            throw new RuntimeException("Document not found: " + documentId);
        }
        documentService.deleteById(documentId);
        return "Deleted document id: " + documentId;
    }
    @GetMapping("/document/course/{courseId}")
    public List<DocumentCourse> getDocumentsByCourseId(@PathVariable int courseId) {
        List<DocumentCourse> documents = documentService.findByCourseId(courseId);
        if (documents.isEmpty()) {
            throw new RuntimeException("No documents found for courseId: " + courseId);
        }
        return documents;
    }
}