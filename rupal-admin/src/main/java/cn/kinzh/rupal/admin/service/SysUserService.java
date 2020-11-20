package cn.kinzh.rupal.admin.service;

import cn.kinzh.rupal.admin.entity.SysUser;
import cn.kinzh.rupal.core.service.CurdService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author inzh
 * @title: SysUserService
 * @Description: 用户业务接口，继承通用增删改查接口
 * @date 2020/11/17
 */
public interface SysUserService extends CurdService<SysUser> {

    SysUser findByName(String username);
}
