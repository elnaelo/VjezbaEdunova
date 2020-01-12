package hr.vjezba;

import javax.swing.JOptionPane;

public class Zadatak3 {

	public static void main(String[] args) {
		int brojac, a ,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("unesi1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("unesi2"));
		
		System.out.println("Prim brojevi izmedu brojeva "+a+" i "+b+" su: ");
		
		for(int i = a ; i <= b ; i++)
		{
			brojac = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					brojac = brojac+1;
			}
			if(brojac == 2)
				System.out.println(i);
		}
	}
}


