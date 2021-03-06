package com.yayao.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yayao.bean.Customer;
import com.yayao.util.PastUtil;

/**
 * 微信接口调用
 * @author yy
 *
 */
@Scope("prototype")
@Controller("weiXin")
@RequestMapping(value="/token")
public class WeiXinController {
	/**
	 * 返回PastUtil的json数据
	 *
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/connection",method=RequestMethod.GET )
	public ResponseEntity<String> connectionWeiXin(@RequestParam("url")String url){
		String json = PastUtil.getParam("wxf70db1421d99a52b", "ba869f32f7b6fff6ab43b8b5ca864448",url);
		return new ResponseEntity<String>(json,HttpStatus.OK);
		
	}
}
