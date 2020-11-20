package cn.kinzh.rupal.admin.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * sys_dept
 * @author 
 */
@Data
public class SysDept implements Serializable {
    /**
     * 编号
     */
    private Long id;

    /**
     * 机构名称
     */
    private String name;

    /**
     * 上级ID
     */
    private Long parentId;

    /**
     * 排序
     */
    private Integer orderNum;

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
     * 是否删除 -1删除 0正常
     */
    private Byte delFlag;

    /**
     * 子部门树 非数据库字段
     */
    private List<SysDept> children;

    /**
     * 上级部门名字 非数据库字段
     */
    private String parentName;

    /**
     * 部门树级别 非数据库字段
     */
    private Integer level;

    private static final long serialVersionUID = 1L;
}