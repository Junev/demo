package com.example.repository.mapper;

import com.example.repository.model.PrdTaskCp;
import com.example.repository.model.PrdTaskCpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdTaskCpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRD_TASK_CP
     *
     * @mbg.generated Sat Dec 02 10:57:53 GMT+08:00 2023
     */
    long countByExample(PrdTaskCpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRD_TASK_CP
     *
     * @mbg.generated Sat Dec 02 10:57:53 GMT+08:00 2023
     */
    int deleteByExample(PrdTaskCpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRD_TASK_CP
     *
     * @mbg.generated Sat Dec 02 10:57:53 GMT+08:00 2023
     */
    int insert(PrdTaskCp row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRD_TASK_CP
     *
     * @mbg.generated Sat Dec 02 10:57:53 GMT+08:00 2023
     */
    int insertSelective(PrdTaskCp row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRD_TASK_CP
     *
     * @mbg.generated Sat Dec 02 10:57:53 GMT+08:00 2023
     */
    List<PrdTaskCp> selectByExample(PrdTaskCpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRD_TASK_CP
     *
     * @mbg.generated Sat Dec 02 10:57:53 GMT+08:00 2023
     */
    int updateByExampleSelective(@Param("row") PrdTaskCp row, @Param("example") PrdTaskCpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRD_TASK_CP
     *
     * @mbg.generated Sat Dec 02 10:57:53 GMT+08:00 2023
     */
    int updateByExample(@Param("row") PrdTaskCp row, @Param("example") PrdTaskCpExample example);
}