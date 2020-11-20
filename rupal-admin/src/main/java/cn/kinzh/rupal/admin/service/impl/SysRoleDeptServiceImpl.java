package cn.kinzh.rupal.admin.service.impl;

import cn.kinzh.rupal.admin.entity.SysRoleDept;
import cn.kinzh.rupal.admin.service.SysRoleDeptService;
import cn.kinzh.rupal.core.page.PageRequest;
import cn.kinzh.rupal.core.page.PageResult;

import java.util.List;

/**
 * @author inzh
 * @title: SysRoleDeptImpl
 * @Description: 角色部门业务实现
 * @date 2020/11/20
 */
public class SysRoleDeptServiceImpl implements SysRoleDeptService {
    @Override
    public int save(SysRoleDept record) {
        return 0;
    }

    @Override
    public int delete(SysRoleDept record) {
        return 0;
    }

    @Override
    public int delete(List<SysRoleDept> records) {
        return 0;
    }

    @Override
    public SysRoleDept findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
