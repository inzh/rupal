package cn.kinzh.rupal.admin.service.impl;

import cn.kinzh.rupal.admin.entity.SysDict;
import cn.kinzh.rupal.admin.mapper.SysDictMapper;
import cn.kinzh.rupal.admin.service.SysDictService;
import cn.kinzh.rupal.core.page.MybatisPageHelper;
import cn.kinzh.rupal.core.page.PageRequest;
import cn.kinzh.rupal.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author inzh
 * @title: SysDictServiceImpl
 * @Description: 字典
 * @date 2020/11/20
 */
@Service
public class SysDictServiceImpl implements SysDictService {

    @Autowired
    private SysDictMapper sysDictMapper;

    @Override
    public int save(SysDict record) {
        if(record.getId() == null || record.getId() == 0) {
            return sysDictMapper.insertSelective(record);
        }
        return sysDictMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(SysDict record) {
        return sysDictMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysDict> records) {
        for(SysDict record: records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public SysDict findById(Long id) {
        return sysDictMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysDict> findByLabel(String label) {
        return sysDictMapper.findPageByLabel(label);
    }

    /**
     * @Author inzh
     * @Description //是否根据label进行分页查询
     * @Date 10:27 2020/11/20
     * @Param [pageRequest]
     * @return cn.kinzh.rupal.core.page.PageResult
     **/
    @Override
    public PageResult findPage(PageRequest pageRequest) {
        Object label = pageRequest.getParam("label");
        if(label != null) {
            return MybatisPageHelper.findPage(pageRequest, sysDictMapper, "findPageByLabel", label);
        }
        return MybatisPageHelper.findPage(pageRequest,sysDictMapper);
    }
}
