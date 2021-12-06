//LALU SAHIBUL PURWA
//KELAS TI B
//semester 2
package Algoritma;

import java.util.Scanner;

public class Panda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] angka=new int[4];
		int elemen;
		int total=0;
		int i=0;
		int rataRata;
		Scanner x = new Scanner(System.in);
		System.out.print("Masukkan jumlah elemen ");
		elemen=x.nextInt();
		//LOOPING
		while (i<elemen) {
			System.out.print("masukkan index ["+i+"] ");
			angka[i]=x.nextInt();
			total=total+angka[i];
			i++;
			}
		rataRata=total/elemen;
		System.out.println("nilai rata rata dari elemen array tersebut adalah "+rataRata);

	}

}
