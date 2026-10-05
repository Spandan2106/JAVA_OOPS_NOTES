class Fraction{
	
	Fraction(int a,int b){
		double s = (double)a/b;
		System.out.println("Fraction is: "+s);
	}
	Fraction(double a,int b){
		double s = a/b;
		System.out.println("Fraction is: "+s);
	}
	Fraction(int a,double b){
		double s = a/b;
		System.out.println("Fraction is: "+s);
	}
}

class Compute{
	public static void main(String args[]){
		Fraction f1 =  new Fraction( 4, 2);
		Fraction f2 =  new Fraction( 10.5, 2);
		Fraction f3 =  new Fraction( 11, 4.5);
	}
}