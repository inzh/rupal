package cn.kinzh.rupal.admin.mapper;

import cn.kinzh.rupal.admin.entity.SysDict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);

    List<SysDict> findPage();

    List<SysDict> findByLabel(@Param(value = "label") String label);

    List<SysDict> findPageByLabel(@Param(value = "label") String label);
}