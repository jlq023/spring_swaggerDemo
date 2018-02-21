package com.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
 
public class Result {
	@ApiModelProperty(value="返回详细信息")
	private String msg;
	@ApiModelProperty(value="返回编码，0成功，其它失败")
	private int code=-1;
	@ApiModelProperty(value="查询接口的返回值")
	private List<Object> data;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public List<Object> getData() {
		return data;
	}
	public void setData(List  data) {
		this.data = data;
	}
	
}
