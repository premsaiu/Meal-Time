/*
 * Created on 15 Jan 2016 ( Time 19:53:25 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.mealtime.dao;

import com.mealtime.bean.MealsMaster;

/**
 * MealsMaster DAO interface
 * 
 * @author Telosys Tools
 */
public interface MealsMasterDAO {

	//----------------------------------------------------------------------
	/**
	 * Finds a bean by its primary key 
	 * @param mealId
	 * @return the bean found or null if not found 
	 */
	public MealsMaster find( Integer mealId ) ;

	//----------------------------------------------------------------------
	/**
	 * Loads the given bean, it is supposed to contains the primary key value(s) in its attribute(s)<br>
	 * If found, the given instance is populated with the values retrieved from the database<br>
	 * If not found, the given instance remains unchanged
	 * @param mealsMaster
	 * @return true if found, false if not found
	 */
	public boolean load( MealsMaster mealsMaster ) ;
	
    //----------------------------------------------------------------------
	/**
	 * Inserts the given bean in the database 
	 * @param mealsMaster
	 */
	public void insert(MealsMaster mealsMaster) ;

    //----------------------------------------------------------------------
	/**
	 * Updates the given bean in the database 
	 * @param mealsMaster
	 * @return
	 */
	public int update(MealsMaster mealsMaster) ;

    //----------------------------------------------------------------------
	/**
	 * Deletes the record in the database using the given primary key value(s) 
	 * @param mealId
	 * @return
	 */
	public int delete( Integer mealId ) ;

    //----------------------------------------------------------------------
	/**
	 * Deletes the given bean in the database 
	 * @param mealsMaster
	 * @return
	 */
	public int delete( MealsMaster mealsMaster ) ;

    //----------------------------------------------------------------------
	/**
	 * Checks the existence of a record in the database using the given primary key value(s)
	 * @param mealId
	 * @return
	 */
	public boolean exists( Integer mealId ) ;

	//----------------------------------------------------------------------
	/**
	 * Checks the existence of the given bean in the database 
	 * @param mealsMaster
	 * @return
	 */
	public boolean exists( MealsMaster mealsMaster ) ;

    //----------------------------------------------------------------------
	/**
	 * Counts all the records present in the database table
	 * @return
	 */
	public long count() ;

}
