package cn.kinzh.rupal.admin.service.impl;

import cn.kinzh.rupal.admin.entity.SysRole;
import cn.kinzh.rupal.admin.service.SysRoleService;
import cn.kinzh.rupal.core.page.PageRequest;
import cn.kinzh.rupal.core.page.PageResult;

import java.util.List;

/**
 * @author inzh
 * @title: SysRoleMenuServiceImpl
 * @Description: 角色菜单实现
 * @date 2020/11/20
 */
public class SysRoleMenuServiceImpl implements SysRoleService {
    @Override
    public int save(SysRole record) {
        return 0;
    }

    @Override
    public int delete(SysRole record) {
        return 0;
    }

    @Override
    public int delete(List<SysRole> records) {
        return 0;
    }

    @Override
    public SysRole findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
