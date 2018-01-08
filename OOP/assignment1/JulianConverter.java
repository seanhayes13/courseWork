package test.classWork;

public class JulianConverter {
	public int dateToJulian(int m, int d, int y){
		int result = ( 1461 * (y + 4800 + (m - 14 ) / 12 ) ) / 4 +
				( 367 * (m - 2 - 12 * ( (m - 14 ) / 12 ) ) ) / 12 -
				( 3 * ( ( y + 4900 + ( m - 14 ) / 12 ) / 100 ) ) / 4 +
				d - 32075;
		return result;
	}
	
	public int[] julianToDate(int j){
		int[] result = new int[3];
		int l = j + 68569;
		int n = ( 4 * l ) / 146097;
		l = l - ( 146097 * n + 3 ) / 4;
		int i = ( 4000 * ( l + 1 ) ) / 1461001;
		l = l - ( 1461 * i ) / 4 + 31;
		j = ( 80 * l ) / 2447;
		result[0] = l - ( 2447 * j ) / 80;
		l = j / 11;
		result[1] = j + 2 - ( 12 * l );
		result[2] = 100 * ( n - 49 ) + i + l;
		return result;
	}
}
