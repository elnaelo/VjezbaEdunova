package hr.vjezba;

import javax.swing.JOptionPane;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int red = 2;
		int stupac = 2;	
		int a[][]= new int [2][2];
		int b[][]= new int [2][2];
		int zbroj[][]=new int[red][stupac];
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
				a[i][j]=Integer.parseInt(JOptionPane.showInputDialog("unesi"));
			}
		}
		for(int i=0; i<b.length;i++) {
			for(int j=0; j<b.length;j++) {
				b[i][j]=Integer.parseInt(JOptionPane.showInputDialog("unesi"));
			}
		}
		
		for(int i=0; i< red; i++) {
			for(int j=0; j<stupac;j++) {
				zbroj[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Suma matrica iznosi: ");
        for(int[] r : zbroj) {
            for (int s : r) {
                System.out.print(s + "    ");
            }
            System.out.println();
        }
	
	
	}
	
}