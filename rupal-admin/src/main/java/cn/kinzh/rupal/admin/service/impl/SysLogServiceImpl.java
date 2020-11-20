package cn.kinzh.rupal.admin.service.impl;

import cn.kinzh.rupal.admin.entity.SysLog;
import cn.kinzh.rupal.admin.service.SysLogService;
import cn.kinzh.rupal.core.page.PageRequest;
import cn.kinzh.rupal.core.page.PageResult;

import java.util.List;

/**
 * @author inzh
 * @title: SysLogServiceImpl
 * @Description: 系统日志
 * @date 2020/11/20
 */
public class SysLogServiceImpl implements SysLogService {
    @Override
    public int save(SysLog record) {
        return 0;
    }

    @Override
    public int delete(SysLog record) {
        return 0;
    }

    @Override
    public int delete(List<SysLog> records) {
        return 0;
    }

    @Override
    public SysLog findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
