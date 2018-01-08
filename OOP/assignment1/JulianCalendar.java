package test.classWork;

public class JulianCalendar {
	public static void main(String[] args){
		JulianConverter jc = new JulianConverter();
		int y = 2018;
		int m = 1;
		int d = 5;
		int j = jc.dateToJulian(m, d, y);
		System.out.println(j);
		
		int[] newDate = jc.julianToDate(j);
		String bcad = "AD";
		if(newDate[2]<0){
			bcad = "BC";
			newDate[2] = newDate[2]*(-1);
		}
		System.out.println(newDate[0] + " - "+newDate[1]+" - "+newDate[2] + " " + bcad);
	}
}
