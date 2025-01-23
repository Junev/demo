package com.example.mybatis.model;

import java.io.Serializable;

public class SysRolePrivilege implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_privilege.role_id
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_privilege.privilege_id
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    private Long privilegeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_role_privilege
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_privilege.role_id
     *
     * @return the value of sys_role_privilege.role_id
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_privilege.role_id
     *
     * @param roleId the value for sys_role_privilege.role_id
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_privilege.privilege_id
     *
     * @return the value of sys_role_privilege.privilege_id
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    public Long getPrivilegeId() {
        return privilegeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_privilege.privilege_id
     *
     * @param privilegeId the value for sys_role_privilege.privilege_id
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}