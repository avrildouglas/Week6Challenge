package com.resume.wk6;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface EducationRepository extends CrudRepository <Education, Long> {

}		
	