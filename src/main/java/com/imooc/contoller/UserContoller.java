package com.imooc.contoller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * ClassName: UserContoller
 * Author:   mctianyu
 * Date:     2019/4/20 21:20
 * Description:
 */
//@Controller
@RestController      //@RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserContoller {

      @RequestMapping("/getUser")
      //@ResponseBody
      public User getUser(){
          User u = new User();
          u.setName("lisi");
          u.setAge(19);
          u.setPassword("123");
          u.setBirthday(new Date());
          u.setDesc("hello springboot>>>");
          return u;
      }

    @RequestMapping("/getUserJson")
    //@ResponseBody
    public IMoocJSONResult getUserjson(){
        User u = new User();
        u.setName("zhangsan");
        u.setAge(19);
        u.setPassword("123456");
        u.setBirthday(new Date());
        u.setDesc("hello springboot>>>");
        return IMoocJSONResult.ok(u);
    }
}
