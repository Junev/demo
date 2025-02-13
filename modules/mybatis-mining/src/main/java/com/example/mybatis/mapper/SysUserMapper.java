package com.example.mybatis.mapper;

import com.example.mybatis.model.SysUser;
import com.example.mybatis.model.SysUserExample;
import com.example.mybatis.model.SysUserWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface SysUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    long countByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    int deleteByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    int insert(SysUserWithBLOBs row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    int insertSelective(SysUserWithBLOBs row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    List<SysUserWithBLOBs> selectByExampleWithBLOBsWithRowbounds(SysUserExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    List<SysUserWithBLOBs> selectByExampleWithBLOBs(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    List<SysUser> selectByExampleWithRowbounds(SysUserExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    List<SysUser> selectByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    SysUserWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    int updateByExampleSelective(@Param("row") SysUserWithBLOBs row, @Param("example") SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    int updateByExampleWithBLOBs(@Param("row") SysUserWithBLOBs row, @Param("example") SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    int updateByExample(@Param("row") SysUser row, @Param("example") SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    int updateByPrimaryKeySelective(SysUserWithBLOBs row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    int updateByPrimaryKeyWithBLOBs(SysUserWithBLOBs row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Thu Sep 19 10:37:21 CST 2024
     */
    int updateByPrimaryKey(SysUser row);
}