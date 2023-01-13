package com.example.repository.mapper;

import com.example.repository.model.EmsEquipmentgroup;
import com.example.repository.model.EmsEquipmentgroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmsEquipmentgroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    long countByExample(EmsEquipmentgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    int deleteByExample(EmsEquipmentgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    int deleteByPrimaryKey(String groupid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    int insert(EmsEquipmentgroup row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    int insertSelective(EmsEquipmentgroup row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    List<EmsEquipmentgroup> selectByExample(EmsEquipmentgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    EmsEquipmentgroup selectByPrimaryKey(String groupid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    int updateByExampleSelective(@Param("row") EmsEquipmentgroup row, @Param("example") EmsEquipmentgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    int updateByExample(@Param("row") EmsEquipmentgroup row, @Param("example") EmsEquipmentgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    int updateByPrimaryKeySelective(EmsEquipmentgroup row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems_equipmentgroup
     *
     * @mbg.generated Wed Jan 11 23:20:17 GMT+08:00 2023
     */
    int updateByPrimaryKey(EmsEquipmentgroup row);
}