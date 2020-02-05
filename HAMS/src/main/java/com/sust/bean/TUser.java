package com.sust.bean;

import org.springframework.web.multipart.MultipartFile;

public class TUser {
	//辅助图片上传属性
    private MultipartFile file;
    
    public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.name
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.account
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.role
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    private String role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.dept
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    private String dept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.age
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.phone
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.pic
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.flag
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    private String flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.name
     *
     * @return the value of t_user.name
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.name
     *
     * @param name the value for t_user.name
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.account
     *
     * @return the value of t_user.account
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.account
     *
     * @param account the value for t_user.account
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.role
     *
     * @return the value of t_user.role
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.role
     *
     * @param role the value for t_user.role
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.dept
     *
     * @return the value of t_user.dept
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public String getDept() {
        return dept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.dept
     *
     * @param dept the value for t_user.dept
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.age
     *
     * @return the value of t_user.age
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.age
     *
     * @param age the value for t_user.age
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.phone
     *
     * @return the value of t_user.phone
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.phone
     *
     * @param phone the value for t_user.phone
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.pic
     *
     * @return the value of t_user.pic
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.pic
     *
     * @param pic the value for t_user.pic
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.flag
     *
     * @return the value of t_user.flag
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public String getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.flag
     *
     * @param flag the value for t_user.flag
     *
     * @mbg.generated Sat Nov 16 12:47:58 CST 2019
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

	@Override
	public String toString() {
		return "TUser [id=" + id + ", name=" + name + ", account=" + account + ", password=" + password + ", role="
				+ role + ", dept=" + dept + ", age=" + age + ", phone=" + phone + ", pic=" + pic + ", flag=" + flag
				+ "]";
	}

	public TUser(Integer id, String name, String account, String password, String role, String dept, Integer age,
			String phone, String pic, String flag) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
		this.password = password;
		this.role = role;
		this.dept = dept;
		this.age = age;
		this.phone = phone;
		this.pic = pic;
		this.flag = flag;
	}

	public TUser() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}