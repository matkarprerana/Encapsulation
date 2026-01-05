package com.tka.jan2;

public class Orderstest {
	
		public static void main(String[]args) {
		orders o1=new orders(1,"Amit","Laptop",1,55000,55000);
		orders o2=new orders(2,"Ravi","mobile",2,15000,22000);
		orders o3=new orders(3,"Neha","Tablet",1,22000,22000);
		orders o4 = new orders(4, "Priya", "Headphones", 2, 2000, 4000);
	    orders o5 = new orders(5, "Rahul", "Keyboard", 1, 1500, 1500);
	    orders o6 = new orders(6, "Sneha", "Mouse", 2, 800, 1600);
	    orders o7 = new orders(7, "Ankit", "Monitor", 1, 12000, 12000);
	    orders o8 = new orders(8, "Pooja", "Printer", 1, 9000, 9000);
	    orders o9 = new orders(9, "Karan", "Speaker", 2, 3000, 6000);
	    orders o10 = new orders(10, "Riya", "Webcam", 1, 2500, 2500);
	    
	    System.out.println(o1);
	    System.out.println(o2);
	    System.out.println(o3);
	    System.out.println(o4);
	    System.out.println(o5);
	    System.out.println(o6);
	    System.out.println(o7);
	    System.out.println(o8);
	    System.out.println(o9);
	    System.out.println(o10);
	    
	    orders o11 = new orders();
		o11.setOrder_Id(11);
		o11.setCust_name("Vikas");
		o11.setPro_name("Hard Disk");
		o11.setQuantity(1);
		o11.setPrice(5000);
		o11.setTotal_amount(5000);
		
		 System.out.println(o11);

		
		
	}

	}


