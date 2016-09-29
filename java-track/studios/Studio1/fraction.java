package Studio1;

public class fraction {
	
	private int numerator;
	private int denominator;
	
	public fraction (int n, int d) {
		this.numerator = n;
		this.denominator = d;
	}
	
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}



	public fraction addFraction (fraction f) {
		int n;
		int d;
		
		n = this.getNumerator() * f.getDenominator() + this.getDenominator() * f.getNumerator();
		
		d = this.getDenominator() * f.getDenominator();
		fraction sum = new fraction (n, d);
		return sum;
		
	}
	
	public fraction multFraction (fraction g) {
		int n;
		int d;
		
		n = this.getNumerator() * g.getNumerator();
		d = this.getDenominator() * g.getDenominator();
		
		fraction product = new fraction (n, d);
		return product;
		
	}

	public fraction flip () {
		int n = this.getDenominator();
		int d = this.getNumerator();
		fraction flipped = new fraction (n, d);
		return flipped;
	}
	
	public fraction simplify () {
		int n = this.getNumerator();
		int d = this.getDenominator();
		int x;
		boolean result = true;
		if (n > d) {
			x = d;
		}
		else {
			x = n;
		}
		while  (x > 1 && result) {
			if (d % x == 0 && n % x == 0) {
				n = n/x;
				d = d/x;
				result = false;
			}
			x--;
		}
		fraction simple = new fraction (n, d);
		return simple;
		
	}
	
	public String toString () {
		return this.getNumerator() + "/" + this.getDenominator();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fraction A = new fraction (8, 12);
		fraction B = new fraction (2, 3);
		fraction C = A.simplify();
		System.out.println(C.toString());
		fraction D = A.addFraction(B);
		D = D.simplify();
		System.out.println(D.toString());
		fraction P = A.multFraction(B);
		P = P.simplify();
		System.out.println(P.toString());
		

	}

}
