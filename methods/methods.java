public class methods{
	public static void main(String[] args) {
		sayiBulmaca();		
	}
	public static void sayiBulmaca(){
		int[] sayilar = new int[]{1,2,3,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;

		for(int sayi:sayilar){
			if(sayi == aranacak){
				varMi = true;
				break;
			}
		}

		if(varMi){
			String mesaj = "Sayi mevcuttur";
			mesajVer(mesaj);
		}else{
			System.out.println("Sayi mevcut degildir.");
		}
	}
	public static void mesajVer(String mesaj){
		System.out.println(mesaj);
	}
}