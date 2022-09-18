public class arkadasSayilar{
	public static void main(String[] args) {
		int number1 = 220;
		int number2 = 284;
		int cacheTotal1 = 0;
		int cacheTotal2 = 0;


		for(int i = 1; i < number1 ;i++){
			if(number1%i == 0){
				cacheTotal1 += i;
			}
		}

		for(int i = 1; i < number2 ;i++){
			if(number2%i == 0){
				cacheTotal2 += i;
			}
		}

		if(cacheTotal1 == number2 && cacheTotal2 == number1){
			System.out.println(number1 + " ile " + number2 + " arkadas sayilardir.");
		}else{
			System.out.println(number1 + " ile " + number2 + " arkadas sayi degillerdir.");
		}
	}
}