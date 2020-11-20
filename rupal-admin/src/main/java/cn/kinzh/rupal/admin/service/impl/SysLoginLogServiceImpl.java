package cn.kinzh.rupal.admin.service.impl;

import cn.kinzh.rupal.admin.entity.SysLoginLog;
import cn.kinzh.rupal.admin.service.SysLoginLogService;
import cn.kinzh.rupal.core.page.PageRequest;
import cn.kinzh.rupal.core.page.PageResult;

import java.util.List;

/**
 * @author inzh
 * @title: SysLoginLogServiceImpl
 * @Description: 系统登录日志
 * @date 2020/11/20
 */
public class SysLoginLogServiceImpl implements SysLoginLogService {

    @Override
    public int save(SysLoginLog record) {
        return 0;
    }

    @Override
    public int delete(SysLoginLog record) {
        return 0;
    }

    @Override
    public int delete(List<SysLoginLog> records) {
        return 0;
    }

    @Override
    public SysLoginLog findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
