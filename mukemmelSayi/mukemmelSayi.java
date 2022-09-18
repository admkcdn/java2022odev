public class mukemmelSayi {
	public static void main(String[] args) {
		int number = 48;
		int cacheTotal = 0;

		for(int i = 1; i < number ;i++){
			if( number % i == 0){
				cacheTotal += i;
			}
		}

		if(cacheTotal == number){
			System.out.println(number + " sayisi mukemmel sayidir.");
		}else {	
			System.out.println(number + " sayisi mukemmel sayi degildir.");
		}
	}
}