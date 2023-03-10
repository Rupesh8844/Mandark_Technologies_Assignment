package com.Mandark_Technologies.Problem2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

//Problem 2 - Employee Listings

public class Problem2 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(new File("C:\\Users\\Rupesh\\Desktop\\Mandark Technologies\\Mandark_Technologies_Assignment\\src\\com\\Mandark_Technologies\\Problem2\\employees.csv"));
			
			File file1  = new File("C:\\Users\\Rupesh\\Desktop\\Mandark Technologies\\Mandark_Technologies_Assignment\\src\\com\\Mandark_Technologies\\Problem2\\managers.csv");
			File file2  = new File("C:\\Users\\Rupesh\\Desktop\\Mandark Technologies\\Mandark_Technologies_Assignment\\src\\com\\Mandark_Technologies\\Problem2\\single_name_employees.csv");
			
			
					try {
						if(!file1.createNewFile()) {
							System.out.println("Sorry file1 is already exists...");
						}
						
						if(!file2.createNewFile()) {
							System.out.println("Sorry file2 is already exists..."+'\n');
						}
						
					
						
						FileOutputStream fos1 = new FileOutputStream(file1);
						FileOutputStream fos2 = new FileOutputStream(file2);
						
						String title = sc.nextLine();
					
						
						while(sc.hasNext()) {
							
							String lines = sc.nextLine();
							String[] str  = lines.split(",");
							
							String name = str[0];
							String role = str[1];
							String division = str[2];
							
//							checking the first condition and adding to manager.csv file
							if(role.equals("Manager")&& division.equals("R&D")) {
								byte[] b = lines.getBytes();
								fos1.write(b);
								fos1.write('\n');
							}
							
							
							String[] names = name.split(" ");
							
							if(names.length ==1) {
								byte[] b = lines.getBytes();
								fos2.write(b);
								fos2.write('\n');
							}
							
						}
						
						fos1.close();
						fos2.close();
						
						
						printResult(file1, file2);
						
						
						
					} catch (IOException e) {
						e.printStackTrace();
					}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	
	
	public static void printResult(File file1, File file2) {
		
		String line = "";  
		
		System.out.println("Entries in managers.csv file -");
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file1));
			
			try {
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  
		
		
		
		System.out.println(" ");
		
		
		
		String line2="";
		System.out.println("Entries in single_name_employees.csv file -");
		BufferedReader br2;
		try {
			br2 = new BufferedReader(new FileReader(file2));
			
			try {
				while ((line2 = br2.readLine()) != null) {
					System.out.println(line2);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}  
		
		
	}
	

}
