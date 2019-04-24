package com.imooc.contoller;

import com.imooc.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: FreemarkerController
 * Author:   mctianyu
 * Date:     2019/4/22 9:14
 * Description:
 */

@Controller
@RequestMapping("ftl")
public class FreemarkerController {

    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("resource", resource);
        return "freemarker/index";
    }

    @RequestMapping("center")
    public String center() {
        return "freemarker/center/center";
    }

}
