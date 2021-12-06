package Algoritma;
import java.util.Scanner;
public class Looping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner f=new Scanner (System.in);
		System.out.print("masukkan nilai variabel ");
		int z=f.nextInt();
		f.close();
		while (z<=10) {
			z+=2;
			System.out.println(z);
			z--;
		}
	}

}
