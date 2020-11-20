package cn.kinzh.rupal.admin.service;

import cn.kinzh.rupal.admin.entity.SysUser;
import cn.kinzh.rupal.admin.entity.SysUserRole;
import cn.kinzh.rupal.core.service.CurdService;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * @author inzh
 * @title: SysUserService
 * @Description: 用户业务接口，继承通用增删改查接口
 * @date 2020/11/17
 */
public interface SysUserService extends CurdService<SysUser> {

    SysUser findByName(String username);

    /**
     * 查找用户的菜单权限标识集合
     */
    Set<String> findPermissions(String userName);

    /**
     * 查找用户的角色集合
     */
    List<SysUserRole> findUserRoles(Long userId);
}
