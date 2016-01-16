/*
 * Created on 15 Jan 2016 ( Time 19:53:26 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.mealtime.bean;

import java.io.Serializable;

import java.util.Date;

/**
 * Java bean for 'UserSubscription' entity
 * 
 * @author Telosys Tools
 *
 */
public class UserSubscription implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : user_id INT 
    private Integer userId;

    // DB : subscription_id INT 
    private Integer subscriptionId;

    // DB : start_date DATE 
    private Date startDate;

    // DB : end_date DATE 
    private Date endDate;

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



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setUserId( Integer userId ) {
        this.userId = userId;
    }
    public Integer getUserId() {
        return this.userId;
    }

    public void setSubscriptionId( Integer subscriptionId ) {
        this.subscriptionId = subscriptionId;
    }
    public Integer getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setStartDate( Date startDate ) {
        this.startDate = startDate;
    }
    public Date getStartDate() {
        return this.startDate;
    }

    public void setEndDate( Date endDate ) {
        this.endDate = endDate;
    }
    public Date getEndDate() {
        return this.endDate;
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


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(userId);
        sb.append("|");
        sb.append(subscriptionId);
        sb.append("|");
        sb.append(startDate);
        sb.append("|");
        sb.append(endDate);
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
        return sb.toString(); 
    } 


}
