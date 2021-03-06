/*
 * Created on 16 Jan 2016 ( Time 20:32:14 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.mealtime.bean;

import java.io.Serializable;

import java.util.Date;

/**
 * Java bean for 'UserMaster' entity
 * 
 * @author Telosys Tools
 *
 */
public class UserMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : user_id INT 
    private Integer userId;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : first_name VARCHAR 
    private String firstName;

    // DB : last_name VARCHAR 
    private String lastName;

    // DB : email VARCHAR 
    private String email;

    // DB : mobile_number VARCHAR 
    private String mobileNumber;

    // DB : address VARCHAR 
    private String address;

    // DB : created_date DATE 
    private Date createdDate;

    // DB : updated_date DATE 
    private Date updatedDate;

    // DB : created_by VARCHAR 
    private String createdBy;

    // DB : updated_by VARCHAR 
    private String updatedBy;

    // DB : status VARCHAR 
    private String status;

    // DB : is_active VARCHAR 
    private String isActive;

    // DB : version INT 
    private Integer version;

    // DB : role_id INT 
    private Integer roleId;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setUserId( Integer userId ) {
        this.userId = userId ;
    }

    public Integer getUserId() {
        return this.userId;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setEmail( String email ) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setMobileNumber( String mobileNumber ) {
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setAddress( String address ) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }

    public void setCreatedDate( Date createdDate ) {
        this.createdDate = createdDate;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setUpdatedDate( Date updatedDate ) {
        this.updatedDate = updatedDate;
    }
    public Date getUpdatedDate() {
        return this.updatedDate;
    }

    public void setCreatedBy( String createdBy ) {
        this.createdBy = createdBy;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setUpdatedBy( String updatedBy ) {
        this.updatedBy = updatedBy;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setStatus( String status ) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

    public void setIsActive( String isActive ) {
        this.isActive = isActive;
    }
    public String getIsActive() {
        return this.isActive;
    }

    public void setVersion( Integer version ) {
        this.version = version;
    }
    public Integer getVersion() {
        return this.version;
    }

    public void setRoleId( Integer roleId ) {
        this.roleId = roleId;
    }
    public Integer getRoleId() {
        return this.roleId;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(userId);
        sb.append("|");
        sb.append(firstName);
        sb.append("|");
        sb.append(lastName);
        sb.append("|");
        sb.append(email);
        sb.append("|");
        sb.append(mobileNumber);
        sb.append("|");
        sb.append(address);
        sb.append("|");
        sb.append(createdDate);
        sb.append("|");
        sb.append(updatedDate);
        sb.append("|");
        sb.append(createdBy);
        sb.append("|");
        sb.append(updatedBy);
        sb.append("|");
        sb.append(status);
        sb.append("|");
        sb.append(isActive);
        sb.append("|");
        sb.append(version);
        sb.append("|");
        sb.append(roleId);
        return sb.toString(); 
    } 


}
