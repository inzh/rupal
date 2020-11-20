package cn.kinzh.rupal.admin.service.impl;

import cn.kinzh.rupal.admin.entity.SysConfig;
import cn.kinzh.rupal.admin.mapper.SysConfigMapper;
import cn.kinzh.rupal.admin.service.SysConfigService;
import cn.kinzh.rupal.core.page.MybatisPageHelper;
import cn.kinzh.rupal.core.page.PageRequest;
import cn.kinzh.rupal.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author inzh
 * @title: SysConfigServiceImpl
 * @Description: 配置
 * @date 2020/11/20
 */
@Service
public class SysConfigServiceImpl implements SysConfigService {


    @Autowired
    private SysConfigMapper sysConfigMapper;

    @Override
    public int save(SysConfig record) {
        if(record.getId() == null || record.getId() == 0) {
            return sysConfigMapper.insertSelective(record);
        }
        return sysConfigMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(SysConfig record) {
        return sysConfigMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysConfig> records) {
        for(SysConfig record:records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public SysConfig findById(Long id) {
        return sysConfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        Object label = pageRequest.getParam("label");
        if(label != null) {
            return MybatisPageHelper.findPage(pageRequest, sysConfigMapper, "findPageByLabel", label);
        }
        return MybatisPageHelper.findPage(pageRequest, sysConfigMapper);
    }

    @Override
    public List<SysConfig> findByLable(String lable) {
        return sysConfigMapper.findByLable(lable);
    }
}
