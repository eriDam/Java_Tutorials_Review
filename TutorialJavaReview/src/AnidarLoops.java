
public class AnidarLoops {

	public static void main(String[] args) {
		//  
		int points = 0;
		int target = 100;
		//antes de inicar el while, damos el nomre a 1 loop
		targetLoop:
		while (target <= 100) {
			for (int i=0; i < target; i++){
				if (points > 50) {
					System.out.println("points = "+points);
					System.out.println("Saliendo de los 2 loops...");
					break targetLoop;}
				points = points + 1;
			}
		}

	}

}
