package com.tnsif.constructor;
import java.util.Scanner;


public class CustomerDemo {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.nextLine();
		System.out.println("enter the address");
		String address=sc.nextLine();
		System.out.println("enter the id");
		int id=sc.nextInt();
		Customer c=new Customer();
		c.setCname(name);
		c.setCaddress(address);
		c.setCid(id);
		System.out.println(c);
		
		boolean output=c instanceof Customer;
		System.out.println(output);
		
	}

}

