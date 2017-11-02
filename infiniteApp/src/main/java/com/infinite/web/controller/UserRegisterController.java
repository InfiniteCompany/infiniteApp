package com.infinite.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infinite.entity.vo.UserRegisterInfo;
import com.infinite.service.UserRegisterService;
import com.infinite.web.model.ResultModel;

/**
*
* 创建日期:2017年10月31日 下午3:58:46
* 创建作者：zijie.liu
* 文件名称：UserRegisterController.java
* 功能：
* 修改记录：
*/
@RestController
@RequestMapping(value = "/api/user")
public class UserRegisterController {

	@Autowired
	private UserRegisterService userRegisterService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResultModel<String> register(@RequestBody @NotNull UserRegisterInfo userRegisterInfo, HttpSession session, HttpServletRequest request) throws Exception {
		
		return ResultModel.success(userRegisterService.register(userRegisterInfo));
	}
	
}
