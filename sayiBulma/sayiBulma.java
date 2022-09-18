public class sayiBulma {
	public static void main(String[] args) {
		int[] numbers = {1,2,5,8,7,4,9,15,48,45,71};
		int foundNumber = 45;
		boolean isFound = false;


		for(int number:numbers){
			if(number == foundNumber){
				System.out.println(foundNumber + " listede mevcut!");
				break;
			}
			isFound = true;
		}
	}
}