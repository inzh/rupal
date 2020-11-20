package cn.kinzh.rupal.admin.controller;

import cn.kinzh.rupal.admin.entity.SysDept;
import cn.kinzh.rupal.admin.service.impl.SysDeptServiceImpl;
import cn.kinzh.rupal.core.http.HttpResult;
import cn.kinzh.rupal.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.List;

/**
 * @author inzh
 * @title: SysDeptController
 * @Description: Todo
 * @date 2020/11/20
 */
@RestController
@RequestMapping("dept")
public class SysDeptController {

    @Autowired
    private SysDeptServiceImpl sysDeptService;

    @PostMapping("/save")
    public HttpResult save(@RequestBody SysDept record) {
        return HttpResult.ok(sysDeptService.save(record));
    }

    @PostMapping("/delete")
    public HttpResult delete(@RequestBody List<SysDept> records) {
        return HttpResult.ok(sysDeptService.delete(records));
    }

    @PostMapping("/findTree")
    public HttpResult findTree() {
        return HttpResult.ok(sysDeptService.findTree());
    }

}
