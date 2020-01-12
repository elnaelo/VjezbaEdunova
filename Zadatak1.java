package hr.vjezba;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {

		int p[]=new int [5];
		
		int zbroj=0;
		
		int max=0;
		int min=0;
		
		for(int i=0; i<p.length;i++) {
			
			p[i]=Integer.parseInt(JOptionPane.showInputDialog("unesi"));
		
		}
		

		for(int i=0; i<p.length;i++) {
			
			zbroj+= p[i];	
			
			if (p[i]>max) {
				max=p[i];
			}
			else if
			(p[i]<=min) {
				min=p[i];
			}
			
		}
		
		System.out.println(zbroj);
		System.out.println(max);
		System.out.println(min);
		
		
		
		

	}
	
}
