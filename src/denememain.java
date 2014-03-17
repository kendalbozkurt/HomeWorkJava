import java.util.Scanner;


public class denememain {

	/**
	 * print pi,e
	 * @param args
	 */
	public static void main(String[] args) {
		int steps;
		try{
		System.out.println(Pihesap.pi());
		Scanner input=new Scanner(System.in);	
		System.out.print("Enter the number of steps:");
		steps=input.nextInt();
		System.out.println(eHesap.e(steps));
		
		}catch(Exception e){
			System.out.println("Please check your writing");
			main(args);
		}
		
	}

}