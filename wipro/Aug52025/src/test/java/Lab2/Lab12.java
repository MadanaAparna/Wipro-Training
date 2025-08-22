package Lab2;

import java.time.LocalDate;
import java.util.Scanner;

public class Lab12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year yyyy-mm-dd");
		String inputDatestr=sc.next();
		
		LocalDate inputDate=LocalDate.parse(inputDatestr);
		System.out.println("Enter year yyyy-mm-dd");
		
		String inputDatestr1=sc.next();
		LocalDate inputDate1=LocalDate.parse(inputDatestr1);
		
		System.out.println("Input date1:"+inputDate);
		System.out.println("Input date2:"+inputDate1);
		
		System.out.println("Days ");
		System.out.print(inputDate.getDayOfMonth()-inputDate1.getDayOfMonth());
		
		System.out.println("Months ");
		System.out.print(inputDate.getMonthValue()-inputDate1.getMonthValue());
		
		System.out.println("years ");
		System.out.print(inputDate.getYear()-inputDate1.getYear());
	}
}
