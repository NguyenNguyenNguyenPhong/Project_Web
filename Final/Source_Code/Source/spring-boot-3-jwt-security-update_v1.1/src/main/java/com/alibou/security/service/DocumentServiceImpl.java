package com.alibou.security.service;

import com.alibou.security.dao.DocumentCourseRepository;
import com.alibou.security.entity.DocumentCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentCourseService {

    private final DocumentCourseRepository documentRepository;

    @Autowired
    public DocumentServiceImpl(DocumentCourseRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public List<DocumentCourse> findAll() {
        return documentRepository.findAll();
    }

    @Override
    public DocumentCourse findById(int id) {
        return documentRepository.findById(id).orElse(null);
    }

    @Override
    public DocumentCourse save(DocumentCourse document) {
        return documentRepository.save(document);
    }

    @Override
    public void deleteById(int id) {
        documentRepository.deleteById(id);
    }
    @Override
    public List<DocumentCourse> findByCourseId(int courseId) {
        return documentRepository.findByCourseID(courseId);
    }
}