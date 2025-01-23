package com.example.mybatis.model;

import java.io.Serializable;

public class SysUserWithBLOBs extends SysUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_info
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    private String userInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.head_img
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    private byte[] headImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_info
     *
     * @return the value of sys_user.user_info
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    public String getUserInfo() {
        return userInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_info
     *
     * @param userInfo the value for sys_user.user_info
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.head_img
     *
     * @return the value of sys_user.head_img
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    public byte[] getHeadImg() {
        return headImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.head_img
     *
     * @param headImg the value for sys_user.head_img
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }
}