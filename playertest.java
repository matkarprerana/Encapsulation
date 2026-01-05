package com.tka.jan1;

public class playertest {

	public static void main(String[] args) {
		players p1=new players(1,45,"Rohit sharma",6211,15,"mi");
		
		System.out.println("Players ID :"+p1.getP_id());
		System.out.println("Players Name :"+p1.getP_name());
		System.out.println("Runs :"+p1.getRuns());
		
		int runs=100;
		p1.setRuns(p1.getRuns()+ runs);
		System.out.println("Total runs :"+p1.getRuns());
		
		players p2=new players(2,93,"Ishan Kishan",2614,0,"mi");
		players p3=new players(3,63,"Suryakumar Yadav",3249,0,"mi");
		players p4=new players(4,9,"Tilak Varma",1156,0,"mi");
		players p5=new players(5,33,"Hardik Pandya",2525,53,"mi");
		players p6=new players(6,17,"Tim David",659,0,"mi");
		players p7=new players(7,93,"Jasprit Bumrah",56,145,"mi");
		players p8=new players(8,50,"Piyush Chawla",624,192,"mi");
		players p9=new players(9,18,"Gerald Coetzee",120,30,"mi");
		players p10=new players(10,27,"Akash Madhawal",20,19,"mi");
		
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(p7);
		System.out.println(p8);
		System.out.println(p9);
		System.out.println(p10);
		
		players p11=new players();
		p11.setP_id(11);
		p11.setJ_no(23);
		p11.setP_name("Nehal Wadhare");
		p11.setRuns(241);
		p11.setWickets(0);
		p11.setTeam_name("mi");
		
		System.out.println(p11);
		

	}

}
