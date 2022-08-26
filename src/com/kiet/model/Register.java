package com.kiet.model;
//model
public class Register {
		int day;
		int month;
		int year;
		
		int rolls[];

		public Register(int day, int month, int year, int[] rolls) {
			super();
			this.day = day;
			this.month = month;
			this.year = year;
			this.rolls = rolls;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int[] getRolls() {
			return rolls;
		}

		public void setRolls(int[] rolls) {
			this.rolls = rolls;
		}
						
}
