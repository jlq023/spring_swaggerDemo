package com.bean;

import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
@ApiModel(value="用户信息")
public class UserVo {
	private long id;
	@ApiModelProperty(required=true,value="登陆账号") 
	private String loginId;
	@ApiModelProperty(required=true,value="用户名称")
	private String userName;
	@ApiModelProperty(required=true,value="密码")
	private String userPass;
	@ApiModelProperty(required=true,value="用户状态。0启用，1禁用")
	private short userStatus;
	private long compoundId;
	
	private String compoundName;
	public long getCompoundId() {
		return compoundId;
	}
	public void setCompoundId(long compoundId) {
		this.compoundId = compoundId;
	}
	public String getCompoundName() {
		return compoundName;
	}
	public void setCompoundName(String compoundName) {
		this.compoundName = compoundName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public short getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(short userStatus) {
		this.userStatus = userStatus;
	}
}
