package com.sdajava.hibernaterelations.inheritance.entity;

public class CardPayment extends Payment{
		private String cardType;

		public String getCardType() {
			return cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}

}
