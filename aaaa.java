package Algoritma;

public class aaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] namapasien= {"upin","ipin","ros","datuk","ehsan"};
		double[]bbpasien= {35,35,57,50,39};
		double[] tbpasien= {120,120,163,165,125};	
		System.out.println(jenisbdn(35,120));
		
	}
		static double indexmstbh(double bb, double tb) {
			double bmi=1000*bb/(tb*tb);
			return bmi;
		}
	static String jenisbdn(double bb, double tb) {
		double idx=indexmstbh(bb,tb);
		System.out.println(idx);
	String s;
	if (idx>=30) {
		s="obesitas";
	}else if(idx>=25) {
		s="gemuk";
	}else if(idx>=23) {
		s="agak berisi";
	}else if(idx>=18.5) {
		s="normal";
	}else {
		s="kurus";
	}
return s;
	}

}
