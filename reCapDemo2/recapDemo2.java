public class recapDemo2  {
	public static void main(String[] args) {
		double[] myList = {1.2,1.3,4.3,5.6};
		double total = 0;
		for(double number:myList){
			total = total + number;
			System.out.println(total);
		}
	}
}