package cn.kinzh.rupal.admin.service.impl;

import cn.kinzh.rupal.admin.entity.SysUser;
import cn.kinzh.rupal.admin.mapper.SysUserMapper;
import cn.kinzh.rupal.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author inzh
 * @title: SysUserServiceImpl
 * @Description: Todo
 * @date 2020/11/17
 */

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
