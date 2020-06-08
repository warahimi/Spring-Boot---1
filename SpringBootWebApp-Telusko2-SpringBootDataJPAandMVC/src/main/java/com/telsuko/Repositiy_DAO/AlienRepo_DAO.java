package com.telsuko.Repositiy_DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.telsuko.model.Alien;

public interface AlienRepo_DAO extends CrudRepository<Alien, Integer> // Since we are using Spring JPA, it gives us the awsome features //<> work with type Alien and the primary key of type Integer
{ // we will get all the crud operations from this interface// and we dont have to implement any of its method as well
	// just inject AlienRepo_DAO inside your controller
	
	List<Alien> findByTech(String tech); //Convention is start by findBy+FiledName
	List<Alien> findByAidGreaterThan(int aid); //Convention is start by findBy+FiledName+GreaterThan...
	List<Alien> findByAidLessThan(int aid);
	
	//What if we want to write our own method name and our own query 
	//fe: find by tech and all the values shoud be sorted 
	
	@Query("from Alien where tech=?1 order by anme")   // our custome JPA Query JPQL query it is as HQL //?1 the vaue comes from user , in JPQL we mention the placeholder number too, because we might have multiple parameters
	List<Alien> findByTechSortByName(String tech);
	
}
