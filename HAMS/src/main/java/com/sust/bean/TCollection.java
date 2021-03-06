package com.sust.bean;

import java.io.Serializable;

public class TCollection implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_collection.id
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_collection.name
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_collection.context
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    private String context;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_collection.views
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    private Integer views;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_collection
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_collection.id
     *
     * @return the value of t_collection.id
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_collection.id
     *
     * @param id the value for t_collection.id
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_collection.name
     *
     * @return the value of t_collection.name
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_collection.name
     *
     * @param name the value for t_collection.name
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_collection.context
     *
     * @return the value of t_collection.context
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_collection.context
     *
     * @param context the value for t_collection.context
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_collection.views
     *
     * @return the value of t_collection.views
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    public Integer getViews() {
        return views;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_collection.views
     *
     * @param views the value for t_collection.views
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collection
     *
     * @mbg.generated Sun Feb 02 15:29:32 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", context=").append(context);
        sb.append(", views=").append(views);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}