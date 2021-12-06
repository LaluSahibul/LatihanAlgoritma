package Algoritma;

import java.util.Scanner;

import java.util.Arrays;

public class Kucing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int [] sahibul=new int[a];
		int i;
		Scanner x = new Scanner(System.in);
		System.out.println("masukkan deret array :");
		//LOOPING
		for(i=0;i<a;i++) {
			System.out.print("array index ke ["+i+"] = ");
			sahibul[i]=x.nextInt();
		}
		System.out.println("deret array diatas adalah "+Arrays.toString(sahibul));
	}
}
