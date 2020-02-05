package com.sust.dao;

import com.sust.bean.TMake;
import com.sust.bean.TMakeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMakeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_make
     *
     * @mbg.generated Mon Nov 11 22:31:06 CST 2019
     */
    long countByExample(TMakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_make
     *
     * @mbg.generated Mon Nov 11 22:31:06 CST 2019
     */
    int deleteByExample(TMakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_make
     *
     * @mbg.generated Mon Nov 11 22:31:06 CST 2019
     */
    int insert(TMake record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_make
     *
     * @mbg.generated Mon Nov 11 22:31:06 CST 2019
     */
    int insertSelective(TMake record);
    TMake selectLast();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_make
     *
     * @mbg.generated Mon Nov 11 22:31:06 CST 2019
     */
    List<TMake> selectByExampleWithBLOBs(TMakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_make
     *
     * @mbg.generated Mon Nov 11 22:31:06 CST 2019
     */
    List<TMake> selectByExample(TMakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_make
     *
     * @mbg.generated Mon Nov 11 22:31:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") TMake record, @Param("example") TMakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_make
     *
     * @mbg.generated Mon Nov 11 22:31:06 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") TMake record, @Param("example") TMakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_make
     *
     * @mbg.generated Mon Nov 11 22:31:06 CST 2019
     */
    int updateByExample(@Param("record") TMake record, @Param("example") TMakeExample example);
}