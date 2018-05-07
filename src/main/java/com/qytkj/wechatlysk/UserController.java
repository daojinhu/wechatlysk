package com.qytkj.wechatlysk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
    * @ClassName: UserController
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author hudaojin
    * @date 2018年4月25日
    *
 */

@RestController
public class UserController {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user() {
		return "springboot";
	}
}
