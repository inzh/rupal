package cn.kinzh.rupal.admin.service;

import cn.kinzh.rupal.admin.entity.SysConfig;
import cn.kinzh.rupal.core.service.CurdService;

import java.util.List;

/**
 * @author inzh
 * @title: SysConfigService
 * @Description: 系统配置
 * @date 2020/11/20
 */
public interface SysConfigService extends CurdService<SysConfig> {

    /**
     * @Author inzh
     * @Description //更具标签查询
     * @Date 15:30 2020/11/20
     * @Param [lable]
     * @return java.util.List<cn.kinzh.rupal.admin.entity.SysConfig>
     **/
    List<SysConfig> findByLable(String lable);
}
