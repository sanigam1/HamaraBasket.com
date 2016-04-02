package com.hamarabasket;

import java.util.Date;

public class Item {
	private Type type;
	private Date sellByDate;
	private Date createdDate;
	private int quality;

	public Item(Type type, Date sellByDate, int quality, Date createdDate) {
		super();
		this.type = type;
		this.sellByDate = sellByDate;
		this.createdDate = createdDate;
		this.quality = quality;
		checkQuality();
	}

	private void checkQuality() {
		Date d1 = new Date();
		Date d2 = this.createdDate;
		Date d3 = this.sellByDate;
		// TODO Auto-generated method stub
		// DEfault Decrease
		if (d2.compareTo(d3) < 0) {
			long diff = Math.abs(d3.getTime() - d2.getTime());
			long diffDays = diff / (24 * 60 * 60 * 1000);

			this.quality = quality - (int) (diffDays);
		}
		if (d1.compareTo(d3) > 0) {
			long diff2 = Math.abs(d1.getTime() - d3.getTime());
			long diffDays1 = diff2 / (24 * 60 * 60 * 1000);
			// exception 2

			this.quality = quality - (2 * (int) (diffDays1));

		}
		if (this.quality < 0) {
			this.quality = 0;
		}
		if (this.quality > 50) {
			this.quality = 50;
		}
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Date getSellByDate() {
		return sellByDate;
	}

	public void setSellByDate(Date sellByDate) {
		this.sellByDate = sellByDate;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
		checkQuality();
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
