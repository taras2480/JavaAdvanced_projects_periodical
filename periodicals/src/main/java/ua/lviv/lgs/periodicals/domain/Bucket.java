package ua.lviv.lgs.periodicals.domain;

import java.sql.Date;

public class Bucket {

	private Integer id;
	private Integer userId;
	private Integer periodicalId;
	private Date purchaseDate;

	public Bucket() {

	}

	public Bucket(Integer userId, Integer periodicalId, Date purchaseDate) {

		this.userId = userId;
		this.periodicalId = periodicalId;
		this.purchaseDate = purchaseDate;
	}

	public Bucket(Integer id, Integer userId, Integer periodicalId, Date purchaseDate) {

		this.id = id;
		this.userId = userId;
		this.periodicalId = periodicalId;
		this.purchaseDate = purchaseDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPeriodicalId() {
		return periodicalId;
	}

	public void setPeriodicalId(Integer periodicalId) {
		this.periodicalId = periodicalId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "Bucket [id=" + id + ", userId=" + userId + ", periodicalId=" + periodicalId + ", purchaseDate="
				+ purchaseDate + "]";
	}

}
