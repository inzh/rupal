package cn.kinzh.rupal.admin.service;

import cn.kinzh.rupal.admin.entity.SysDept;
import cn.kinzh.rupal.core.service.CurdService;

import java.util.List;

/**
 * @author inzh
 * @title: SysDeptService
 * @Description: 部门
 * @date 2020/11/20
 */
public interface SysDeptService extends CurdService<SysDept> {

    /**
     * @Author inzh
     * @Description // 查询部门树
     * @Date 16:07 2020/11/20
     * @Param []
     * @return java.util.List<cn.kinzh.rupal.admin.entity.SysDept>
     **/
    List<SysDept> findTree();
}
