package com.sust.bean;

import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.locks.StampedLock;

import org.springframework.format.annotation.DateTimeFormat;

public class TMaintenance {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_maintenance.id
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_maintenance.content
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_maintenance.date
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_maintenance.dept
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	private String dept;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_maintenance.buildId
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	private Integer buildid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_maintenance.id
	 * @return  the value of t_maintenance.id
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_maintenance.id
	 * @param id  the value for t_maintenance.id
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_maintenance.content
	 * @return  the value of t_maintenance.content
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_maintenance.content
	 * @param content  the value for t_maintenance.content
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_maintenance.date
	 * @return  the value of t_maintenance.date
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_maintenance.date
	 * @param date  the value for t_maintenance.date
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_maintenance.dept
	 * @return  the value of t_maintenance.dept
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_maintenance.dept
	 * @param dept  the value for t_maintenance.dept
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_maintenance.buildId
	 * @return  the value of t_maintenance.buildId
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	public Integer getBuildid() {
		return buildid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_maintenance.buildId
	 * @param buildid  the value for t_maintenance.buildId
	 * @mbg.generated  Wed Dec 11 11:25:01 CST 2019
	 */
	public void setBuildid(Integer buildid) {
		this.buildid = buildid;
	}
}