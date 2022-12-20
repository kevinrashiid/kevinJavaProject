package _17_comprobarArray;

public class comprobarArray {

	public static void main(String[] args) {
		
//dado un array con numeros cualquiera hacer un programa que nos diga
//si hay o no algun numero par en el array
		int [] nums= {5,7,8,3,1,11,4};
		boolean existepar=false;
		for (int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				existepar=true;
				break;//para dejar de buscar por que solo nos interesa saber si hay o no un par
			}
			
		}
		if(existepar==true) {
			System.out.println("hay al menos un par");
			
		}else {
			System.out.println("no hay ningun par");
		}
		
		
		
		
	}

}
