package cn.kinzh.rupal.core.service;

import cn.kinzh.rupal.core.page.PageRequest;
import cn.kinzh.rupal.core.page.PageResult;

import java.util.List;

/**
 * @author inzh
 * @title: CrudService
 * @Description: 通用crud接口
 * @date 2020/11/18
 */
public interface CurdService<T> {

    /*
     * @Author inzh
     * @Description 保存操作
     * @Date 21:06 2020/11/18
     * @Param [record]
     * @return int
     **/

    int save(T record);

    int delete(T record);

    int delete(List<T> records);

    T findById(Long id);

    PageResult findPage(PageRequest pageRequest);
}
