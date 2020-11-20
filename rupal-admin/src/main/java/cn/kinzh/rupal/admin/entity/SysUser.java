package cn.kinzh.rupal.admin.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * sys_user
 * @author 
 */
@Data
public class SysUser implements Serializable {
    /**
     * 编号
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态：0禁用，1正常
     */
    private Byte status;

    /**
     * 班级id
     */
    private Long classId;

    /**
     * 院系id
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
     * 最后更新人
     */
    private String lastUpdateBy;

    /**
     * 最后更新时间
     */
    private Date lastCreateTime;

    /**
     * 是否删除 -1删除， 0正常
     */
    private Byte delFlag;

    // 非数据库字段
    private String deptName;

    // 非数据库字段
    private String roleNames;

    // 非数据库字段
    private List<SysUserRole> userRoles = new ArrayList<>();

    private static final long serialVersionUID = 1L;
}