package com.sust.bean;

public class TTechnique {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_technique.id
     *
     * @mbg.generated Fri Dec 13 10:58:14 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_technique.name
     *
     * @mbg.generated Fri Dec 13 10:58:14 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_technique.content
     *
     * @mbg.generated Fri Dec 13 10:58:14 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_technique.pic
     *
     * @mbg.generated Fri Dec 13 10:58:14 CST 2019
     */
    private String pic;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_technique.id
     *
     * @return the value of t_technique.id
     *
     * @mbg.generated Fri Dec 13 10:58:14 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_technique.id
     *
     * @param id the value for t_technique.id
     *
     * @mbg.generated Fri Dec 13 10:58:14 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_technique.name
     *
     * @return the value of t_technique.name
     *
     * @mbg.generated Fri Dec 13 10:58:14 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_technique.name
     *
     * @param name the value for t_technique.name
     *
     * @mbg.generated Fri Dec 13 10:58:14 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_technique.content
     *
     * @return the value of t_technique.content
     *
     * @mbg.generated Fri Dec 13 10:58:14 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_technique.content
     *
     * @param content the value for t_technique.content
     *
     * @mbg.generated Fri Dec 13 10:58:14 CST 2019
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_technique.pic
     *
     * @return the value of t_technique.pic
     *
     * @mbg.generated Fri Dec 13 10:58:14 CST 2019
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_technique.pic
     *
     * @param pic the value for t_technique.pic
     *
     * @mbg.generated Fri Dec 13 10:58:14 CST 2019
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

	@Override
	public String toString() {
		return "TTechnique [id=" + id + ", name=" + name + ", content=" + content + ", pic=" + pic + "]";
	}
    
}