package com.kiet.model;
//model
public class Student {
		private int roll;
		private String name;
		private String branch;
		private char section;
		
		public Student(int roll, String name, String branch, char section) {
			super();
			this.roll = roll;
			this.name = name;
			this.branch = branch;
			this.section = section;
		}

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public char getSection() {
			return section;
		}

		public void setSection(char section) {
			this.section = section;
		}
		
		
		
}
