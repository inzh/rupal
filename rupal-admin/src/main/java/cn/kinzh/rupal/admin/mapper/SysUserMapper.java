package cn.kinzh.rupal.admin.mapper;

import cn.kinzh.rupal.admin.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);


    List<SysUser> findPage();

    SysUser findByName(@Param(value = "username") String username);

    List<SysUser> findPageByName(@Param(value="name") String name);

    List<SysUser> findPageByNameAndEmail(@Param(value="name") String name, @Param(value="email") String email);
}