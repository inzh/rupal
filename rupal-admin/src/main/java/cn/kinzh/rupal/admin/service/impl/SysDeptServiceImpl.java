package cn.kinzh.rupal.admin.service.impl;

import cn.kinzh.rupal.admin.entity.SysDept;
import cn.kinzh.rupal.admin.service.SysDeptService;
import cn.kinzh.rupal.core.page.PageRequest;
import cn.kinzh.rupal.core.page.PageResult;

import java.util.List;

/**
 * @author inzh
 * @title: SysDeptServiceImpl
 * @Description: 部门
 * @date 2020/11/20
 */
public class SysDeptServiceImpl implements SysDeptService {

    @Override
    public int save(SysDept record) {
        return 0;
    }

    @Override
    public int delete(SysDept record) {
        return 0;
    }

    @Override
    public int delete(List<SysDept> records) {
        return 0;
    }

    @Override
    public SysDept findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
