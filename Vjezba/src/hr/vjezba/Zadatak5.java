package hr.vjezba;

import javax.swing.JOptionPane;

public class Zadatak5 {

	public static void main(String[] args) {
	     System.out.println("Enter The Value For N :");
        
	         
	        int n = Integer.parseInt(JOptionPane.showInputDialog("unesi n"));
	        
	        int m = Integer.parseInt(JOptionPane.showInputDialog("unesi m"));	        
	        int matrica [][] = new int[n][m];
	         
	        int value = 1;
	         
	        int minCol = 0;
	         
	        int maxCol = m-1;
	         
	        int minRow = 0;
	         
	        int maxRow = n-1;
	         
	        while (value <= n*m)
	        {
	            for (int i = minCol; i <= maxCol; i++)
	            {
	                matrica[minRow][i] = value;
	                     
	                value++;
	            }
	             
	            for (int i = minRow+1; i <= maxRow; i++) 
	            { 
	                matrica[i][maxCol] = value; 
	                 
	                value++; 
	            } 
	             
	            for (int i = maxCol-1; i >= minCol; i--)
	            {
	                matrica[maxRow][i] = value;
	                             
	                value++;
	            }
	             
	            for (int i = maxRow-1; i >= minRow+1; i--) 
	            {
	                matrica[i][minCol] = value;
	                 
	                value++;
	            }
	             
	            minCol++;
	             
	            minRow++;
	             
	            maxCol--;
	             
	            maxRow--;
	        }
	}

}
