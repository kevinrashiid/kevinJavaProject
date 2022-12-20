package _14_Loteria_Primitiva;

public class loteria {

	public static void main(String[] args) {

		int [] ganadora={3,7,21,11,14};
		int [] boleto= {10,11,21,24,25};
		int [] premios= {0,0,8,200,35000,150000};
		
		//cuantos aciertos a tenido el boleto
		//cuantos numeros del segundo array estan en el primero
		int aciertos=0;
		for(int i=0;i<boleto.length;i++) {
			for(int k=0;k<ganadora.length;k++) {
				if(boleto[i]==ganadora[k]) {
					aciertos++;
				}	
			}
		}
		System.out.println(aciertos);
		//indicar el premio que le corresponde
		switch (aciertos) {
		case 0:System.out.println("Te llevas 0€");
		break;
		case 1:System.out.println("Te llevas 0€");
		break;
		case 2:System.out.println("Te llevas 8€");
		break;
		case 3: System.out.println("Te llevas 200€");
		break;
		case 4:System.out.println("Te llevas 35000");
		break;
		case 5:System.out.println("Te llevas 150000");
		break;
		default:
			System.out.println("no tienes premio");
	//esta es otra forma para indicar el premio
			//System.out.println("premio:"+premios[aciertos-1]);
		}
	}
}