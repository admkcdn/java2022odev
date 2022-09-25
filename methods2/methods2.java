public class methods2{
	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel";
		System.out.println(mesaj);
		int sayilar = topla(5,8);
		System.out.println(sayilar);

		System.out.println(topla2(2,3,4,8,66,4));
	}

	public static void ekle(){
		System.out.println("Eklendi");
	}
	public static void sil(){
		System.out.println("Silindi");
	}
	public static void guncelle(){
		System.out.println("Guncellendi");
	}

	public static int topla(int sayi1, int sayi2){
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar){
		int toplam = 0;
		for(int sayi:sayilar){
			toplam+=sayi;
		}
		return toplam;
	}
}