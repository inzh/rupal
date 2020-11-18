package cn.kinzh.rupal.admin.controller;

import cn.kinzh.rupal.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author inzh
 * @title: UserController
 * @Description: Todo
 * @date 2020/11/17
 */

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/findall")
    public Object findAll() {
        return sysUserService.findAll();
    }

}
