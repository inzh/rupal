package cn.kinzh.rupal.admin.controller;

import cn.kinzh.rupal.admin.entity.SysConfig;
import cn.kinzh.rupal.admin.service.SysConfigService;
import cn.kinzh.rupal.core.http.HttpResult;
import cn.kinzh.rupal.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author inzh
 * @title: SysConfigController
 * @Description: 配置Controller
 * @date 2020/11/20
 */
@RestController
@RequestMapping("config")
public class SysConfigController {

    @Autowired
    private SysConfigService sysConfigService;

    @PostMapping("/save")
    public HttpResult save(@RequestBody SysConfig record) {
        return HttpResult.ok(sysConfigService.save(record));
    }

    @PostMapping("/delete")
    public HttpResult delete(@RequestBody List<SysConfig> records) {
        return HttpResult.ok(sysConfigService.delete(records));
    }

    @GetMapping("/findById")
    public HttpResult findById(@RequestParam Long id) {
        return HttpResult.ok(sysConfigService.findById(id));
    }

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysConfigService.findPage(pageRequest));
    }

    @GetMapping("/findByLabel")
    public HttpResult findByLabel(@RequestParam String label) {
        return HttpResult.ok(sysConfigService.findByLable(label));
    }

}
