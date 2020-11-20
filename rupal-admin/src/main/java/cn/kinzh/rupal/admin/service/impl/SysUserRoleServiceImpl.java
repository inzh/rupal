package cn.kinzh.rupal.admin.service.impl;

import cn.kinzh.rupal.admin.entity.SysUserRole;
import cn.kinzh.rupal.admin.service.SysUserRoleService;
import cn.kinzh.rupal.core.page.PageRequest;
import cn.kinzh.rupal.core.page.PageResult;

import java.util.List;

/**
 * @author inzh
 * @title: SysUserRoleServiceImpl
 * @Description: 用户角色实现
 * @date 2020/11/20
 */
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Override
    public int save(SysUserRole record) {
        return 0;
    }

    @Override
    public int delete(SysUserRole record) {
        return 0;
    }

    @Override
    public int delete(List<SysUserRole> records) {
        return 0;
    }

    @Override
    public SysUserRole findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
