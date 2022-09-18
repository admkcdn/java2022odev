public class miniProjeAsalSayi{
	public static void main(String[] args) {
		Type1(9785463);
		Type1(91);
	}

	public static void Type1(int number){
		int num = number;
		boolean isPrime = true;



		for(int i = 2; i < num; i++){
			if(num % i == 0){
				isPrime = false;
				System.out.println(num + " sayisi suna bolundu: " + i);
			}
		}

		if(isPrime == true){
			System.out.println(num + " sayisi asaldir.");
		}else{	
			System.out.println(num + " sayisi asal degildir.");
		}

	}

	public static void Type2(int num){
		int number = num;
		boolean isPrime = true;

		int[] checkNumber = {2,3,5,7,11,13,17};

		for(int check:checkNumber){
			if(number%check == 0){
				isPrime = false;
				break;
			}
		}

		if(isPrime == true){
			System.out.println(number + " sayisi asaldir.");
		}else{	
			System.out.println(number + " sayisi asal degildir.");
		}
	}

}