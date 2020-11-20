package cn.kinzh.rupal.admin.service;

import cn.kinzh.rupal.admin.entity.SysDict;
import cn.kinzh.rupal.core.service.CurdService;

import java.util.List;

/**
 * @author inzh
 * @title: SysDictService
 * @Description: 字典业务接口，继承通用增删改查接口
 * @date 2020/11/20
 */
public interface SysDictService extends CurdService<SysDict> {

    List<SysDict> findByLabel(String label);

}
