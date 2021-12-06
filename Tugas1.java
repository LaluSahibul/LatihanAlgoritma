package Algoritma;

import java.util.Scanner;

public class Tugas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner (System.in);
		System.out.print("warna rambut ");
		String wr=x.nextLine();
		System.out.print("warna kulit ");
		String wk=x.nextLine();
		System.out.print("jenis kelamin ");
		char jk=x.next().charAt(0);
		System.out.print("tinggi badan ");
		int tb=x.nextInt();
		x.close();
		if (wr.contentEquals("hitam") && wk.contentEquals("coklat gelap") && jk=='P' && tb==160) {
			System.out.println("anak pak zaki");
		}else if (wr.contentEquals("pirang") && wk.contentEquals("putih") && jk=='L' && tb==170) {
			System.out.println("anak pak joko");
		}else {
			System.out.println("dia bukan anak yang hilang");
		}
	}
}
