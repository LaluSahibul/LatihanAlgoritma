package Algoritma;

import java.util.Scanner;

public class Uts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String [][] sahibul = new String[2][1];
		System.out.println("masukkan nilai pada masing masing index array");
		
		//LOOPING
		for (int i = 0; i < 2; i++)
		{
		    for(int j = 0; j < 1; j++) {
		        System.out.print("nilai pada index baris ke ["+i+"]["+j+"] :");
		       
		    sahibul[i][j] = sc.next(); 
		}
		  

		}
		
		for (int i = 0; i < 2; i++)
		{
		    for(int j = 0; j < 1; j++) {
		        System.out.println("nilai pada ["+i+"]["+j+"] :"+sahibul[i][j]);
		       
		}
		  

		}
	}
}