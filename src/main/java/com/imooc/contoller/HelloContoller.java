package com.imooc.contoller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloContoller
 * Author:   mctianyu
 * Date:     2019/4/20 21:07
 * Description:
 */
@RestController
public class HelloContoller {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object hello(){
        return "hello springboot>>>>";
    }

    @RequestMapping("/getResource")
    public IMoocJSONResult getResource(){

        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);

        return IMoocJSONResult.ok(bean);
    }

}
