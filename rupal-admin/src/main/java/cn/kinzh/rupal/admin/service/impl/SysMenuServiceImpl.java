package cn.kinzh.rupal.admin.service.impl;

import cn.kinzh.rupal.admin.entity.SysMenu;
import cn.kinzh.rupal.admin.service.SysMenuService;
import cn.kinzh.rupal.core.page.PageRequest;
import cn.kinzh.rupal.core.page.PageResult;

import java.util.List;

/**
 * @author inzh
 * @title: SysMenuServiceImpl
 * @Description: 权限菜单
 * @date 2020/11/20
 */
public class SysMenuServiceImpl implements SysMenuService {
    @Override
    public int save(SysMenu record) {
        return 0;
    }

    @Override
    public int delete(SysMenu record) {
        return 0;
    }

    @Override
    public int delete(List<SysMenu> records) {
        return 0;
    }

    @Override
    public SysMenu findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
