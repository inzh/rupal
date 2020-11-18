package cn.kinzh.rupal.admin.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sys_dict
 * @author 
 */
@Data
public class SysDict implements Serializable {
    /**
     * 编号
     */
    private Long id;

    /**
     * 数据值
     */
    private String value;

    /**
     * 标签
     */
    private String label;

    /**
     * 类型
     */
    private String type;

    /**
     * 描述
     */
    private String description;

    /**
     * 排序
     */
    private Long sort;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String lastUpdateBy;

    /**
     * 更新时间
     */
    private Date lastUpdateTime;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 是否删除 -1删除， 0正常
     */
    private Byte delFlag;

    private static final long serialVersionUID = 1L;
}