import java.util.Scanner;

public class FooCorporation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double horas = 0;
		double paga = 0;
		double paga_final = 0;
		Scanner datos = new Scanner (System.in);
		Scanner dinero = new Scanner (System.in);
		
		System.out.println("Cuantas horas trabajaste?");
		
		horas = datos.nextDouble();
		
		System.out.println("Cual es tu paga?");
		
		paga = dinero.nextDouble();
		
		if (paga<8 || horas>60){
			
		System.out.println("Error");}
			
			else{
				if (horas>40){
					paga_final = (paga*40) + ((horas-40)*paga*1.5);
				System.out.println("Tu paga es " + paga_final);
				}
				
				else{
					paga_final = (horas*paga);
				System.out.println("Tu paga es " + paga_final);
				}
			}
	}
}

			
		


