package cn.kinzh.rupal.admin.service;

import cn.kinzh.rupal.admin.entity.SysMenu;
import cn.kinzh.rupal.admin.entity.SysRole;
import cn.kinzh.rupal.admin.entity.SysRoleMenu;
import cn.kinzh.rupal.core.service.CurdService;

import java.util.List;

/**
 * @author inzh
 * @title: SysRoleService
 * @Description: 角色业务
 * @date 2020/11/20
 */
public interface SysRoleService extends CurdService<SysRole> {
    /**
     * 查询全部
     * @return
     */
    List<SysRole> findAll();

    /**
     * 查询角色菜单集合
     * @return
     */
    List<SysMenu> findRoleMenus(Long roleId);

    /**
     * 保存角色菜单
     * @param records
     * @return
     */
    int saveRoleMenus(List<SysRoleMenu> records);

    /**
     * 根据名称查询
     * @param name
     * @return
     */
    List<SysRole> findByName(String name);
}
