package com.hrms.project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.project.entities.concretes.cv.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{

}
