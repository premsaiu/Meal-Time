package com.mealtime.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mealtime.bean.UserMaster;
import com.mealtime.dao.impl.spring.UserMasterDAOImplSpring;

@Service("mealTimeService")
public class MealTimeService {
	
	@Autowired
	UserMasterDAOImplSpring userMasterDAO;
	
	public UserMaster saveProfile(UserMaster userMaster){
		System.out.println("In MealTimeService :: saveProfile()");
		System.out.println("Mobile Number ::"+userMaster.getMobileNumber());
		Integer userId = userMaster.getUserId();
		UserMaster user = null;
		if(userId != null){
			user = userMasterDAO.find(userId);
			user.setFirstName(userMaster.getFirstName());
			user.setAddress(userMaster.getAddress());
			userMasterDAO.update(user);
		}else{
			userMaster.setRoleId(2);
			userId = userMasterDAO.insert(userMaster);
			System.out.println("user Id::"+userId);
			user = userMasterDAO.find(userId);
		}
		return user;
	}
}
