package firstTests_;

import java.util.Calendar;
import java.util.Scanner;
public class FindMyAgeV2_1 {

	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		//1stly transformin date to days
		//	YEARs to Days
		double yearInDays=(Calendar.getInstance().get(Calendar.YEAR)*365.25);
		//	MONTHs to Days
		int month=(Calendar.getInstance().get(Calendar.MONTH));
		int monthInDays=0;
		if(month==1) {
			monthInDays=0;
		}
		if(month==2) {
			monthInDays=31;
		}
		if(month==3) {
			monthInDays=59;
		}
		if(month==4) {
			monthInDays=90;
		}
		if(month==5) {
			monthInDays=120;
		}
		if(month==6) {
			monthInDays=151;
		}
		if(month==7) {
			monthInDays=181;
		}
		if(month==8) {
			monthInDays=212;
		}
		if(month==9) {
			monthInDays=243;
		}
		if(month==10) {
			monthInDays=273;
		}
		if(month==11) {
			monthInDays=304;
		}
		if(month==12) {
			monthInDays=334;
		}
		//	import MonthDay
		double day=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		//	the hole Date In Days
		double dateInDays=yearInDays+monthInDays+day;
		
		//	importing User Infos
		System.out.print("\nEnter the year that you have borned in (inDigits): ");
		int yearOfBurth=reader.nextInt();
		System.out.print("\nEnter the month that you have borned in (inDigits): ");
		int monthOfButh=reader.nextInt();
		System.out.print("\nEnter the day that you have borned in (inDigits): ");
		int dayOfBurth=reader.nextInt();
		
		//	transforming User Infos To Days
		double yearOfBurthinDays=yearOfBurth*365.25;
		
		int monthOfButhInDays=0;
		if(monthOfButh==1) {
			monthOfButhInDays=0;
		}
		if(monthOfButh==2) {
			monthOfButhInDays=31;
		}
		if(monthOfButh==3) {
			monthOfButhInDays=59;
		}
		if(monthOfButh==4) {
			monthOfButhInDays=90;
		}
		if(monthOfButh==5) {
			monthOfButhInDays=120;
		}
		if(monthOfButh==6) {
			monthOfButhInDays=151;
		}
		if(monthOfButh==7) {
			monthOfButhInDays=181;
		}
		if(monthOfButh==8) {
			monthOfButhInDays=212;
		}
		if(monthOfButh==9) {
			monthOfButhInDays=243;
		}
		if(monthOfButh==10) {
			monthOfButhInDays=273;
		}
		if(monthOfButh==11) {
			monthOfButhInDays=304;
		}
		if(monthOfButh==12) {
			monthOfButhInDays=334;
		}
		//	som(dateOBurth)
		double burthDateInDays=yearOfBurthinDays+monthOfButhInDays+dayOfBurth;
		
		//	difference
		double ageInDays=dateInDays-burthDateInDays;
		
		//message bax mayhesx lUser blmalal
		System.out.println("You Age Is : "+ageInDays+" Days.");
		
		//	transforming age from days to date.
		double ageYears=ageInDays/365.25;
		double reste1double=ageInDays%365.25;
		double ageMonths=0;
		double ageDays=0;
		if(reste1double<=31) {
			ageMonths=0;
			ageDays=reste1double;
		}
		if((reste1double>31) && (reste1double<=59)) {
			ageMonths=1;
			ageDays=reste1double-31;
		}
		if((reste1double>59) && (reste1double<=90)) {
			ageMonths=2;
			ageDays=reste1double-59;
		}
		if((reste1double>90) && (reste1double<=120)) {
			ageMonths=3;
			ageDays=reste1double-90;
		}
		if((reste1double>120) && (reste1double<=151)) {
			ageMonths=4;
			ageDays=reste1double-120;
		}
		if((reste1double>151) && (reste1double<=181)) {
			ageMonths=5;
			ageDays=reste1double-151;
		}
		if((reste1double>181) && (reste1double<=212)){
			ageMonths=6;
			ageDays=reste1double-181;
		}
		if((reste1double>212) && (reste1double<=243)) {
			ageMonths=7;
			ageDays=reste1double-212;
		}
		if((reste1double>243) && (reste1double<=273)){
			ageMonths=8;
			ageDays=reste1double-243;
		}
		if((reste1double>273) && (reste1double<=304)) {
			ageMonths=9;
			ageDays=reste1double-273;
		}
		if((reste1double>304) && (reste1double<=334)) {
			ageMonths=10;
			ageDays=reste1double-304;
		}
		if(reste1double>334) {
			ageMonths=11;
			ageDays=reste1double-334;
		}
		//int ageYearsEx=(Integer)ageYears; bghit nzwel l fasila lli ghat khrej f ageYears
		//	result
		System.out.println("You have "+ageYears+" years and "+ageMonths+" and "+ageDays);
		System.out.println("\n End App");
		
	}

}
