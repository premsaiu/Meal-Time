/*
 * Created on 15 Jan 2016 ( Time 19:53:26 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.mealtime.dao;

import com.mealtime.bean.UserRoleMaster;

/**
 * UserRoleMaster DAO interface
 * 
 * @author Telosys Tools
 */
public interface UserRoleMasterDAO {

	//----------------------------------------------------------------------
	/**
	 * Finds a bean by its primary key 
	 * @param roleId
	 * @return the bean found or null if not found 
	 */
	public UserRoleMaster find( Integer roleId ) ;

	//----------------------------------------------------------------------
	/**
	 * Loads the given bean, it is supposed to contains the primary key value(s) in its attribute(s)<br>
	 * If found, the given instance is populated with the values retrieved from the database<br>
	 * If not found, the given instance remains unchanged
	 * @param userRoleMaster
	 * @return true if found, false if not found
	 */
	public boolean load( UserRoleMaster userRoleMaster ) ;
	
    //----------------------------------------------------------------------
	/**
	 * Inserts the given bean in the database 
	 * @param userRoleMaster
	 */
	public void insert(UserRoleMaster userRoleMaster) ;

    //----------------------------------------------------------------------
	/**
	 * Updates the given bean in the database 
	 * @param userRoleMaster
	 * @return
	 */
	public int update(UserRoleMaster userRoleMaster) ;

    //----------------------------------------------------------------------
	/**
	 * Deletes the record in the database using the given primary key value(s) 
	 * @param roleId
	 * @return
	 */
	public int delete( Integer roleId ) ;

    //----------------------------------------------------------------------
	/**
	 * Deletes the given bean in the database 
	 * @param userRoleMaster
	 * @return
	 */
	public int delete( UserRoleMaster userRoleMaster ) ;

    //----------------------------------------------------------------------
	/**
	 * Checks the existence of a record in the database using the given primary key value(s)
	 * @param roleId
	 * @return
	 */
	public boolean exists( Integer roleId ) ;

	//----------------------------------------------------------------------
	/**
	 * Checks the existence of the given bean in the database 
	 * @param userRoleMaster
	 * @return
	 */
	public boolean exists( UserRoleMaster userRoleMaster ) ;

    //----------------------------------------------------------------------
	/**
	 * Counts all the records present in the database table
	 * @return
	 */
	public long count() ;

}