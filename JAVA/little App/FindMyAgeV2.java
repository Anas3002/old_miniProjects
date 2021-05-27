package firstTests_;

import java.util.Calendar;
import java.util.Scanner;

public class FindMyAgeV2 {

/**les fun kamlin khass ykounou double bax ntjeneb l2akhta2 lli mt3l9in bl kind dyal l variables
	*flwel kol haja andirha inxaellah f fun dyalha
	*matalan l YEARS anhwelhom l DAYS f fun bohdha
	*wl MONTHS f fun bohdha
	*f fun okhra njme3hom / ila 3reft kifax
	*
	*/
	
	static Scanner reader=new Scanner(System.in);
	
	static double yearOfBurth;
	static int monthOfButh;
	static int dayOfBurth;
	
	static double yearToDays() {
		double year=(Calendar.getInstance().get(Calendar.YEAR)*365.25);
		return (year);
		}
	static int  monthsToDays() {
		int month=(Calendar.getInstance().get(Calendar.MONTH));
		int monthInDays=0;
		//daba anfsel bin xhor lli kaysaliw b 31 w 30 w 28/29
		//hadxi lli jay derto bax maneklx mn lyam dyal xher hit ghaykono mhsobin bl2ayam mnin andir get(Calendar.DAY_OF_MONTH);
		//dikxi lax makanhsebx xher mbl2ayam dyalo walakin blyam dyal xhora lli ghayjiw mn be3do
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
		return (monthInDays);
	}

	static double yearOfBurthdayToDays() {
		yearOfBurth=yearOfBurth*365.25;
		return (yearOfBurth);
		}
	static int monthsBurthToDays(int monthOfButh) {
		//daba anfsel bin xhor lli kaysaliw b 31 w 30 w 28/29
		//hadxi lli jay derto bax maneklx mn lyam dyal xher hit ghaykono mhsobin bl2ayam mnin andir get(Calendar.DAY_OF_MONTH);
		//dikxi lax makanhsebx xher mbl2ayam dyalo walakin blyam dyal xhora lli ghayjiw mn be3do
		if(monthOfButh==1) {
			monthOfButh=0;
		}
		if(monthOfButh==2) {
			monthOfButh=31;
		}
		if(monthOfButh==3) {
			monthOfButh=59;
		}
		if(monthOfButh==4) {
			monthOfButh=90;
		}
		if(monthOfButh==5) {
			monthOfButh=120;
		}
		if(monthOfButh==6) {
			monthOfButh=151;
		}
		if(monthOfButh==7) {
			monthOfButh=181;
		}
		if(monthOfButh==8) {
			monthOfButh=212;
		}
		if(monthOfButh==9) {
			monthOfButh=243;
		}
		if(monthOfButh==10) {
			monthOfButh=273;
		}
		if(monthOfButh==11) {
			monthOfButh=304;
		}
		if(monthOfButh==12) {
			monthOfButh=334;
		}
		return (monthOfButh);
	}

	static double ageInDays() {
		//this will calculate age in days by sum(yearOfBurth,monthOfButh,dayOfBurth)
		//	double ageInDays=yearOfBurth+monthOfButh+dayOfBurth;
		return(yearOfBurth+monthOfButh+dayOfBurth);
	}
	static double dateInDays() {
		double n1=yearToDays();
		double n2=monthsToDays();
		double n3=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		return (n1+n2+n3);
	}
	
	static double difference() {
		return (dateInDays()-ageInDays());
	}
	
	static void transfaringResultsToRealDate() {
		double ageYears=difference()/365.25;
		double reste1double=difference()%365.25;
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
		if(reste1double<334) {
			ageMonths=11;
			ageDays=reste1double-334;
		}
		System.out.println("You have "+ageYears+" years and "+ageMonths+" and "+ageDays);
		System.out.println("In Other form you age is "+difference());
	}
	
	static void main(String[] args) {
		System.out.print("\nEnter the year that you have borned in (inDigits): ");
		yearOfBurth=reader.nextDouble();
		System.out.print("\nEnter the month that you have borned in (inDigits): ");
		monthOfButh=reader.nextInt();
		System.out.print("\nEnter the day that you have borned in (inDigits): ");
		dayOfBurth=reader.nextInt();
		yearOfBurthdayToDays();
		monthsBurthToDays(monthOfButh);
		transfaringResultsToRealDate();	
	}
}