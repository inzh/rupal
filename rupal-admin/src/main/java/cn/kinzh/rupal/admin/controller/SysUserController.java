package cn.kinzh.rupal.admin.controller;

import cn.kinzh.rupal.admin.entity.SysUser;
import cn.kinzh.rupal.admin.service.SysUserService;
import cn.kinzh.rupal.core.http.HttpResult;
import cn.kinzh.rupal.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author inzh
 * @title: SysUserController
 * @Description: Todo
 * @date 2020/11/20
 */

@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping("/save")
    public HttpResult save(@RequestBody SysUser record) {
        return HttpResult.ok(sysUserService.save(record));
    }

    @PostMapping("/delete")
    public HttpResult delete(@RequestBody List<SysUser> records) {
        return HttpResult.ok(sysUserService.delete(records));
    }


    /**
     * @Author inzh
     * @Description //Get请求都要写这个注释 @RequestParam
     * @Date 11:27 2020/11/20
     * @Param [username]
     * @return cn.kinzh.rupal.core.http.HttpResult
     **/
    @GetMapping("/findByName")
    public HttpResult findByName(@RequestParam String username) {
        return HttpResult.ok(sysUserService.findByName(username));
    }

    @GetMapping("/findById")
    public HttpResult findById(@RequestParam Long id) {
        return HttpResult.ok(sysUserService.findById(id));
    }

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysUserService.findPage(pageRequest));
    }
}
