package com.Project.Dairy.Project.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.Dairy.Project.model.BuyNow;

@Repository
@Qualifier("BuyRepo")
public interface BuyNowRepository extends JpaRepository <BuyNow,Integer> {

}
