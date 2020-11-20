package cn.kinzh.rupal.admin.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * sys_menu
 * @author 
 */
@Data
public class SysMenu implements Serializable {
    /**
     * 编号
     */
    private Long id;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 父菜单ID，一级菜单为0
     */
    private Long parentId;

    /**
     * 菜单url
     */
    private String url;

    /**
     * 授权
     */
    private String perms;

    /**
     * 类型 0目录， 1菜单， 2按钮
     */
    private Integer type;

    /**
     * 菜单图标
     */
    private String icon;

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

    // 非数据库字段
    private String parentName;

    // 非数据库字段
    private Integer level;

    // 非数据库字段
    private List<SysMenu> children;

    private static final long serialVersionUID = 1L;
}