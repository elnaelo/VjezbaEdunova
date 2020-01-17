package hr.vjezba;

import javax.swing.JOptionPane;

public class Zadatak5 {
	
	public static void main(String[] args) {
		
		

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int mini=0;
		int minj=0;
		int maxi=a-1;
		int maxj=b-1;
		int[][] matrica = new int [a][b];
		int broj=1;
		
		while(broj<=a*b) {

	
		for(int i=maxj;i>=mini;i--) {
			matrica[maxi][i]=broj++;
		}

		for(int i=maxi-1;i>=mini;i--) {
			matrica[i][minj]=broj++;
			
		}
		
		for(int i=minj+1;i<=maxj;i++) {
			matrica[mini][i]=broj++;
		}
		
		for(int i=mini+1;i<=maxi-1;i++) {
			matrica[i][maxj]=broj++;
		
		}
		 minj++;  
         mini++;          
         maxj--;
         maxi--;
		 }
		for (int i = 0; i < a; i++)
	    {
	        for (int j = 0; j < b; j++)
	        {
	            System.out.print(matrica[i][j]+ "\t");
	        }
	         
	        System.out.println();
	    	}
		 }
	}
	



