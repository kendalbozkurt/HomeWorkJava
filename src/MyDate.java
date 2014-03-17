
public class MyDate {
	private int Year;
	private int Day;
	private int Month;
	/**
	 * 
	 * @return date of year
	 */
	public int getYear() {
		return Year;
	}
	/**
	 * 
	 * @param year:enter from user
	 */
	public void setYear(int year) {
		if(year>0)
		Year = year;
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		if(day<=31&&day>0)
		Day = day;
		else
			System.out.println("Please check your writing");
			
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		if(month<=12 &&month>0)
			Month = month;
		else
			System.out.println("Please check your writing");
	}
	public String getDate(){
		String d=Integer.toString(getDay());
		String y=Integer.toString(getYear());
		
		if(getMonth()==1){
			String x="Ocak";
			return (d+" "+x+" "+y);
		}
		else if(getMonth()==2){
			String x="Şubat";
			return (d+" "+x+" "+y);
		}
		else if(getMonth()==3){
			String x="Mart";
			return (d+" "+x+" "+y);
		}
		else if(getMonth()==4){
			String x="Nisan";
			return (d+" "+x+" "+y);
		}
		else if(getMonth()==5){
			String x="Mayıs";
			return (d+" "+x+" "+y);
		}
		else if(getMonth()==6){
			String x="Haziran";
			return (d+" "+x+" "+y);
		}
		else if(getMonth()==7){
			String x="Temmuz";
			return (d+" "+x+" "+y);
		}
		else if(getMonth()==8){
			String x="Ağustos";
			return (d+" "+x+" "+y);
		}
		else if(getMonth()==9){
			String x="Eylül";
			return (d+" "+x+" "+y);
		}else if(getMonth()==10){
			String x="Ekim";
			return (d+" "+x+" "+y);
		}else if(getMonth()==11){
			String x="Kasım";
			return (d+" "+x+" "+y);
		}
		else if(getMonth()==12){
			String x="Aralık";
			return (d+" "+x+" "+y);
			
		}
		
		return "";
	}
	static boolean isBigger(MyDate x,MyDate y){
		if(x.getYear()>y.getYear()){
			return true;
		}
		else
			return false;
		
	}
	
}
