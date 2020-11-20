package cn.kinzh.rupal.admin.service;

import cn.kinzh.rupal.admin.entity.SysMenu;
import cn.kinzh.rupal.core.service.CurdService;

import java.util.List;

/**
 * @author inzh
 * @title: SysMenuService
 * @Description: 权限菜单
 * @date 2020/11/20
 */
public interface SysMenuService extends CurdService<SysMenu> {

    /**
     * @Author inzh
     * @Description //查询菜单树,用户ID和用户名为空则查询全部
     * // 获取菜单类型，0：获取所有菜单，包含按钮，1：获取所有菜单，不包含按钮
     * @Date 17:39 2020/11/20
     * @Param [userName, menuType]
     * @return java.util.List<cn.kinzh.rupal.admin.entity.SysMenu>
     **/
    List<SysMenu> findTree(String userName, int menuType);

    /**
     * @Author inzh
     * @Description // 根据用户名查找菜单列表
     * @Date 17:40 2020/11/20
     * @Param [userName]
     * @return java.util.List<cn.kinzh.rupal.admin.entity.SysMenu>
     **/
    List<SysMenu> findByUser(String userName);
}
