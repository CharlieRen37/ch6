public class rootGuess{
	public static void main(String[] args){
		squareRoot(36.0);
	}
	public static double squareRoot(double n){
		double i;
		for(i = n/2; Math.abs(i-(i+n/i)/2)>=0.0001; i=((i+n/i)/2)){
		}		
		return (i);
	}
}
