package com.Project.Dairy.Project.repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.Dairy.Project.model.Contacts;

@Repository
@Qualifier("conRepo")
public interface ContactsRepository extends JpaRepository <Contacts,Integer>
{

}
	


