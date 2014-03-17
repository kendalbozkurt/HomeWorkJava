
public class eHesap {
	/**
	 * this function calculating e
	 * @return:the e to the x
	 */
	
	static double e(double step){
		double e=1;
		int a=1;
		
		for(int i=1;i<=step;i++){
			a=a*i;
			e+=Math.pow((double)Math.pow(step,i)*(1/a),1/step);
		}
		return Math.pow(e,step);
	}
	
}
