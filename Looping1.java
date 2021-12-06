package Algoritma;
import java.util.Scanner;
public class Looping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner f=new Scanner (System.in);
		System.out.print("masukkan nilai variabel ");
		int xy=f.nextInt();
		f.close();
		while (xy<=6) {
			xy++;
			System.out.println(xy+1);
		}
	}

}
