package com.scan.controll;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import springfox.documentation.annotations.ApiIgnore;

import com.alibaba.fastjson.JSONObject;
import com.bean.Result;
import com.bean.UserVo;

@Controller
@RequestMapping("/userController")
@Api(tags = "二：用户信息")
public class UserController {

	@RequestMapping(value = "/listCompound", method = RequestMethod.GET)
	@ResponseBody
	@ApiResponses(value = {
			@ApiResponse(code = 500, message = "系统错误"),
			@ApiResponse(code = 200, message = "0 成功,其它为错误,返回格式：{code:0,data[{}]},data中的属性参照下方Model", response = UserVo.class) })
	@ApiOperation(httpMethod = "GET", value = "个人信息")
	public String listCompound(
			@ApiParam(required = true, name = "start", value = "start") int start,
			int limit,
			@ApiParam(required = false, name = "userName", value = "名称模糊查询") String userName) {
		List<UserVo> data = new ArrayList<UserVo>();
		String msg = data.size() > 0 ? "" : "没有查询到相关记录";
		Result result = new Result();
		result.setMsg(msg);
		result.setCode(0);
		result.setData(data);
		return JSONObject.toJSONString(result);
	}

	@RequestMapping(value = "/save", method = { RequestMethod.GET,
			RequestMethod.POST })
	@ResponseBody
	@ApiOperation(httpMethod = "GET", value = "保存用户信息")
	public String saveUser(@RequestBody UserVo user) {
		user.setId(System.currentTimeMillis());
		String msg = "error";
		Result result = new Result();
		result.setCode(0);
		msg = "操作成功";
		result.setMsg(msg);
		return JSONObject.toJSONString(result);
	}

}
