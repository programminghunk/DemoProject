package com.kiet.controller;

import com.kiet.model.Register;
//logic
public class DAO {
	
	public void markAttnd(int roll, int day, int month, int year, Register[] reg) {

		for (Register r : reg) {
			if (r == null) {

				return;
			}
			if (r.getDay() == day && r.getMonth() == month && r.getYear() == year) {
				int k[] = r.getRolls();
				int j = 0;
				while (k[j] != 0 && j < k.length) {
					j++;
				}
				k[j] = roll;
				System.out.println("Attendance marked successfully");
			}
		}
	}

	public void displayAllAttnd(Register[] reg) {
		for (Register r : reg) {
			if (r == null) {
				return;
			}
			System.out.print(r.getDay() + "/" + r.getMonth() + "/" + r.getYear());
			System.out.print("[");
			for (int z : r.getRolls()) {
				if (z != 0) {
					System.out.print(":" + z);
				}
			}
			System.out.print("]\n");
		}
	}

	public void displayAllAbsent()
	{
		
	}
	
	public void displayPercentAttnd()
	{
		
	}
	
	public void updateAttand()
	{
		
	}
	
}
