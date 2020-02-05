package com.sust.bean;

import java.io.Serializable;

public class MakeImage implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column make_image.image
	 * @mbg.generated  Mon Feb 03 22:16:58 CST 2020
	 */
	private String image;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column make_image.make_id
	 * @mbg.generated  Mon Feb 03 22:16:58 CST 2020
	 */
	private Integer makeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table make_image
	 * @mbg.generated  Mon Feb 03 22:16:58 CST 2020
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column make_image.image
	 * @return  the value of make_image.image
	 * @mbg.generated  Mon Feb 03 22:16:58 CST 2020
	 */
	public String getImage() {
		return image;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column make_image.image
	 * @param image  the value for make_image.image
	 * @mbg.generated  Mon Feb 03 22:16:58 CST 2020
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column make_image.make_id
	 * @return  the value of make_image.make_id
	 * @mbg.generated  Mon Feb 03 22:16:58 CST 2020
	 */
	public Integer getMakeId() {
		return makeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column make_image.make_id
	 * @param makeId  the value for make_image.make_id
	 * @mbg.generated  Mon Feb 03 22:16:58 CST 2020
	 */
	public void setMakeId(Integer makeId) {
		this.makeId = makeId;
	}

	public MakeImage( String image, Integer makeId) {
		super();
		this.image = image;
		this.makeId = makeId;
	}

	public MakeImage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table make_image
	 * @mbg.generated  Mon Feb 03 22:16:58 CST 2020
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", image=").append(image);
		sb.append(", makeId=").append(makeId);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}