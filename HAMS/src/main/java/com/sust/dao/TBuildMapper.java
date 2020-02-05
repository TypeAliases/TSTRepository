package com.sust.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sust.bean.TBuild;
import com.sust.bean.TBuildExample;

public interface TBuildMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_build
     *
     * @mbg.generated Tue Dec 17 15:09:04 CST 2019
     */
    long countByExample(TBuildExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_build
     *
     * @mbg.generated Tue Dec 17 15:09:04 CST 2019
     */
    int deleteByExample(TBuildExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_build
     *
     * @mbg.generated Tue Dec 17 15:09:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_build
     *
     * @mbg.generated Tue Dec 17 15:09:04 CST 2019
     */
    int insert(TBuild record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_build
     *
     * @mbg.generated Tue Dec 17 15:09:04 CST 2019
     */
    int insertSelective(TBuild record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_build
     *
     * @mbg.generated Tue Dec 17 15:09:04 CST 2019
     */
    List<TBuild> selectByExampleWithBLOBs(TBuildExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_build
     *
     * @mbg.generated Tue Dec 17 15:09:04 CST 2019
     */
    List<TBuild> selectByExample(TBuildExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_build
     *
     * @mbg.generated Tue Dec 17 15:09:04 CST 2019
     */
    TBuild selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBuild record, @Param("example") TBuildExample example);

    int updateByExampleWithBLOBs(@Param("record") TBuild record, @Param("example") TBuildExample example);

    int updateByExample(@Param("record") TBuild record, @Param("example") TBuildExample example);

    int updateByPrimaryKeySelective(TBuild record);

    int updateByPrimaryKeyWithBLOBs(TBuild record);

    int updateByPrimaryKey(TBuild record);
    
    void updateContentByid(TBuild record) ;
    
    
}