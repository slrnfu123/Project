package com.wine.web.entity;

public class WineEntity {
	 
		private int id;
		private String winename;
		private int price;
		private String img;
		
		

		public WineEntity() {
			
		}
		
		public WineEntity(int id, String winename, int price, String img) {
			super();
			this.id = id;
			this.winename = winename;
			this.price = price;
			this.img = img;
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getWinename() {
			return winename;
		}
		public void setWinename(String winename) {
			this.winename = winename;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getImg() {
			return img;
		}
		public void setImg(String img) {
			this.img = img;
		}
	}



