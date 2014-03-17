import java.util.Scanner;


public class MyDateTest {
		/**
		 * this function is main 
		 * @param args
		 */
	public static void main(String[] args) {
		int day,month,year;
		boolean control;
		MyDate date1=new MyDate();
		MyDate date2=new MyDate();
		Scanner input =new Scanner(System.in);
		try{
			System.out.print("Enter day(date1):");
			day=input.nextInt();
			System.out.print("Enter month(date1):");
			month=input.nextInt();
			System.out.print("Enter year(date1):");
			year=input.nextInt();
			date1.setDay(day);
			date1.setMonth(month);
			date1.setYear(year);
			System.out.println(date1.getDate());
			System.out.print("Enter day:");
			day=input.nextInt();
			System.out.print("Enter month:");
			month=input.nextInt();
			System.out.print("Enter year:");
			year=input.nextInt();
			date2.setDay(day);
			date2.setMonth(month);
			date2.setYear(year);
			System.out.println(date2.getDate());
		}catch(Exception e){
			System.out.println("Please check your writing..");
			MyDateTest.main(args);
		}

		control=MyDate.isBigger(date1,date2);
		if(control==true){
			System.out.println("date1 is bigger than from other..");
		}
		else
			{System.out.println("date1 is smaller than from other..");}
		
	}

}
