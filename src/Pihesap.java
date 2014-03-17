
public class Pihesap {
	/**
	 * this function calculating pi 
	 * @return:pi
	 */
	
	static double pi(){
		double pi=4;
		for(int i=3;i<200000;i+=2){
			pi -= ((double)4/i);
			i+=2;
			pi += ((double)4/i);
			//System.out.println(pi);
		}
		return pi;
		
	}
	
}
