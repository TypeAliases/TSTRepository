package com.sust.dao;

import com.sust.bean.TImage;
import com.sust.bean.TImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_image
     *
     * @mbg.generated Thu Dec 19 22:33:53 CST 2019
     */
    long countByExample(TImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_image
     *
     * @mbg.generated Thu Dec 19 22:33:53 CST 2019
     */
    int deleteByExample(TImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_image
     *
     * @mbg.generated Thu Dec 19 22:33:53 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_image
     *
     * @mbg.generated Thu Dec 19 22:33:53 CST 2019
     */
    int insert(TImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_image
     *
     * @mbg.generated Thu Dec 19 22:33:53 CST 2019
     */
    int insertSelective(TImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_image
     *
     * @mbg.generated Thu Dec 19 22:33:53 CST 2019
     */
    List<TImage> selectByExample(TImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_image
     *
     * @mbg.generated Thu Dec 19 22:33:53 CST 2019
     */
    TImage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_image
     *
     * @mbg.generated Thu Dec 19 22:33:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") TImage record, @Param("example") TImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_image
     *
     * @mbg.generated Thu Dec 19 22:33:53 CST 2019
     */
    int updateByExample(@Param("record") TImage record, @Param("example") TImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_image
     *
     * @mbg.generated Thu Dec 19 22:33:53 CST 2019
     */
    int updateByPrimaryKeySelective(TImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_image
     *
     * @mbg.generated Thu Dec 19 22:33:53 CST 2019
     */
    int updateByPrimaryKey(TImage record);
}