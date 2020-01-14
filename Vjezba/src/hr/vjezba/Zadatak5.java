package hr.vjezba;



public class Zadatak5 {
	
	public static void main(String[] args) {
	        int minRow = 0;
		
		

		int a = 5;
		int b = 4;
		int mini=0;
		int minj=0;
		int maxi=a-1;
		int maxj=b-1;
		int broj=1;
		
		int[][] matrica = new int [a][b];
		 {
		for(int i=maxj;i>=0;i--) {
			matrica[maxi][i]=broj++;
		}
		
		for(int i=maxj;i>=0;i--) {
			matrica[i][minj]=broj++;
		}
		
		for(int i=minj+1;i<=maxj;i++) {
			matrica[mini][i]=broj++;
		}
		
		for(int i=mini+1;i<maxi;i++) {
			matrica[i][maxj]=broj++;
		
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
	}

