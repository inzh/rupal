package cn.kinzh.rupal.admin.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sys_role_dept
 * @author 
 */
@Data
public class SysRoleDept implements Serializable {
    /**
     * 编号
     */
    private Long id;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 机构id
     */
    private Long deptId;

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

    private static final long serialVersionUID = 1L;
}