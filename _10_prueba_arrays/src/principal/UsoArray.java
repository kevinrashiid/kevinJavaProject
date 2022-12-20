package principal;

public class UsoArray {

	public static void main(String[] args) {
		int[] nums=new int[4];
		nums[0]=20;
		nums[1]=29;
		nums[2]=8;
		nums[3]=7;
		System.out.println(nums[2]);//muestra el contenido de la posicion 2
		 
		//.length muestra el numero de tamaño que tiene el array
		for(int i=0;i<nums.length;i++) {//Recoremos el array de espacio 4
			System.out.println(nums[i]); //muestra todos
		}
	}
}
