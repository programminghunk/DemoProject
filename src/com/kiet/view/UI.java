package com.kiet.view;

import java.util.Scanner;

import com.kiet.controller.DAO;
import com.kiet.model.Register;

public class UI {

	public static void main(String[] args) {
		Register[] reg=new Register[31];
		reg[0]=new Register(1, 8, 2022, new int[50]);
		reg[1]=new Register(2, 8, 2022, new int[50]);
		reg[2]=new Register(3, 8, 2022, new int[50]);
		reg[3]=new Register(4, 8, 2022, new int[50]);
		reg[4]=new Register(5, 8, 2022, new int[50]);
		reg[5]=new Register(6, 8, 2022, new int[50]);

		DAO dao=new DAO();
		
			System.out.println("=======================================");
			System.out.println("========welcome  to attnd system=======");
			System.out.println("Enter 1 to mark attendance/ 2 to display all attendance\n/-1 to exit");
			Scanner scan=new Scanner(System.in);
			int choice=scan.nextInt();
			while(choice!=-1)
			{
			switch (choice) {
			case 1:
				System.out.println("Enter roll to mark attendance/ Enter -1 to exit");
				int roll=scan.nextInt();
				while(roll!=-1)
				{
					System.out.println("Enter date");
					int date=scan.nextInt();
					dao.markAttnd(roll, date, 8, 2022, reg);
					roll=scan.nextInt();
					System.out.println("enter next roll or enter -1 to exit");
				}
				break;
			case 2:
				dao.displayAllAttnd(reg);
				break;

			default:
				
				break;
			}
			System.out.println("enter -1 to exit");
			choice=scan.nextInt();
			}
			
			
			
			
//	dao.markAttnd(21, 1, 8, 2022, reg);
//	dao.markAttnd(23, 1, 8, 2022, reg);
//	dao.markAttnd(25, 1, 8, 2022, reg);
//	dao.markAttnd(2, 1, 8, 2022, reg);
//	dao.markAttnd(11, 1, 8, 2022, reg);
//	dao.markAttnd(21, 2, 8, 2022, reg);
//	dao.markAttnd(7, 2, 8, 2022, reg);
//	
//	
//	dao.displayAllAttnd(reg);
			System.out.println("=======================================");
	
	}

}
