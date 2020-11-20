package cn.kinzh.rupal.admin.controller;

import cn.kinzh.rupal.admin.entity.SysDict;
import cn.kinzh.rupal.admin.service.SysDictService;
import cn.kinzh.rupal.core.http.HttpResult;
import cn.kinzh.rupal.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author inzh
 * @title: SysDictController
 * @Description: Todo
 * @date 2020/11/20
 */
@RestController
@RequestMapping("dict")
public class SysDictController {

    @Autowired
    private SysDictService sysDictService;

    @PostMapping("/save")
    public HttpResult save(@RequestBody SysDict record) {
        return HttpResult.ok(sysDictService.save(record));
    }

    @PostMapping("/delete")
    public HttpResult delete(@RequestBody List<SysDict> records) {
        return HttpResult.ok(sysDictService.delete(records));
    }

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysDictService.findPage(pageRequest));
    }

    /**
     * @Author inzh
     * @Description //分页操作，参数使用注释 @RequestParam
     * @Date 11:21 2020/11/20
     * @Param [label]
     * @return cn.kinzh.rupal.core.http.HttpResult
     **/
    @GetMapping("/findByLabel")
    public HttpResult findByLabel(@RequestParam String label) {
        return HttpResult.ok(sysDictService.findByLabel(label));
    }

}
