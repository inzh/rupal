package cn.kinzh.rupal.admin.controller;

import cn.kinzh.rupal.admin.entity.SysLoginLog;
import cn.kinzh.rupal.admin.service.SysLoginLogService;
import cn.kinzh.rupal.core.http.HttpResult;
import cn.kinzh.rupal.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author inzh
 * @title: SysLoginLogController
 * @Description: Todo
 * @date 2020/11/20
 */
@RestController
@RequestMapping("loginlog")
public class SysLoginLogController {

    @Autowired
    private SysLoginLogService sysLoginLogService;

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysLoginLogService.findPage(pageRequest));
    }

    @PostMapping("/delete")
    public HttpResult delete(@RequestBody List<SysLoginLog> record) {
        return HttpResult.ok(sysLoginLogService.delete(record));
    }

}
