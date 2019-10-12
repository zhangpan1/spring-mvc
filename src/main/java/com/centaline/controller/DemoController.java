package com.centaline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangpan on 2019/10/12.
 */
@Controller
@RequestMapping("/home")
public class DemoController {
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
