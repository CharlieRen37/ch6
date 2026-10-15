public class gauss{
	public static void main(String[] agrs){
		System.out.println(gauss(3.0,1000000000));
		System.out.println(Math.exp(-3.0*3.0));
	}
	public static double gauss (double x, int n){
		double sum=0.0;
		double term = 1.0;
		for(double i = 1.0; i<=n; i=i+1){ 
			sum += term;
			term = term *(-x*x/i);
		}
		//alternative method: 
		//double sum=1.0;
		//double term = 1.0;
		//for(double i = 2.0; i<=n; i=i+1){ 
			//term = term *(-x*x/i);
			//sum += term;
		//}
		return sum;
	}
}
