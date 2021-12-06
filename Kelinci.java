package Algoritma;

import java.util.Scanner;

public class Kelinci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);

		String [][] sahibul = new String[2][1];
		System.out.println("masukkan nilai pada masing masing index array");
		
		//LOOPING
		for (int i = 0; i < sahibul.length; i++)
		{
		    for(int j = 0; j < sahibul[i].length; j++) {
		        System.out.format("nilai pada index baris ke ["+i+"]"+"["+j+"] = " );
		    sahibul[i][j] = x.next(); 
		}
		    
		}
		int j=0;
		System.out.println("    "+j);
		for (int i = 0; i < 2; i++)
		{
		    for(j = 0; j < 1; j++) {
		       System.out.format(i+"|"+sahibul[i][j]+"|\n");
		}
		  

		}
	}
}