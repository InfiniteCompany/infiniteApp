package com.infinite.entity.vo;

import java.util.Date;

/**
*
* 创建日期:2017年10月31日 下午4:09:29
* 创建作者：zijie.liu
* 文件名称：UserRegisterInfo.java
* 功能：
* 修改记录：
*/
public class UserRegisterInfo {

	private Long id;
	
	private String name;
	
	private String userName;
	
	private String phoneNumber;
	
	private Date createdAt;
	
	private Date updatedAt;
	
	private Byte isDeleted;
	

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Byte getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
