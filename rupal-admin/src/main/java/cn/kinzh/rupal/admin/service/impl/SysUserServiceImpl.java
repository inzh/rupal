package cn.kinzh.rupal.admin.service.impl;

import cn.kinzh.rupal.admin.entity.SysUser;
import cn.kinzh.rupal.admin.mapper.SysUserMapper;
import cn.kinzh.rupal.admin.service.SysUserService;
import cn.kinzh.rupal.core.page.MybatisPageHelper;
import cn.kinzh.rupal.core.page.PageRequest;
import cn.kinzh.rupal.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author inzh
 * @title: SysUserServiceImpl
 * @Description: 用户
 * @date 2020/11/17
 */

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByName(String username) {
        return sysUserMapper.findByName(username);
    }


    @Override
    public int save(SysUser record) {
        if(record.getId() ==null || record.getId() == 0) {
            return sysUserMapper.insertSelective(record);
        }
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(SysUser record) {
        return sysUserMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysUser> records) {
        for(SysUser record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public SysUser findById(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysUserMapper);
    }
}
