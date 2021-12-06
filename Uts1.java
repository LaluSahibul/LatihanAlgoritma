package Algoritma;

import java.util.Scanner;

public class Uts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] umar=new int[3];
		int i,elemen=3;
		Scanner x = new Scanner(System.in);
		System.out.println("masukkan deret array :");
		for(i=0;i<elemen;i++) {
			System.out.print("masukkan index ["+i+"] = ");
			umar[i]=x.nextInt();
		}
		System.out.println("deret array diatas adalah ["+umar[i-3]+","+umar[i-2]+","+umar[i-1]+"]");
	}
}
