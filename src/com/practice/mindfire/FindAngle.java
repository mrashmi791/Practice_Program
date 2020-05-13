package com.practice.mindfire;

import java.util.Scanner;

public class FindAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter time in [hh:mm] format:-");
		String time = sc.nextLine();
		String[] s1 = time.split(":");
		
		double hour = Integer.parseInt(s1[0]);
//		System.out.println("Enter minutes");
		double min = Integer.parseInt(s1[1]);
		System.out.println(convert(hour,min) +" "+ "degree");
	}

	public static double convert(double hour, double min) {
		if(hour == 12) {
			hour = 0;
		}
		double h_angle =  (0.5*(hour*60 + min));
		double m_angle = (6*min);
		double angle = h_angle - m_angle;
		if(angle < 0) {
			angle *= -1;
		}
		
		if(angle > 180.0) {
			angle = 360 - angle;
		}
		return angle;
		
	}
}
