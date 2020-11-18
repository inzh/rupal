package cn.kinzh.rupal.admin.service;

import cn.kinzh.rupal.admin.entity.SysUser;

import java.util.List;

/**
 * @author inzh
 * @title: SysUserService
 * @Description: Todo
 * @date 2020/11/17
 */
public interface SysUserService {
    List<SysUser> findAll();
}
