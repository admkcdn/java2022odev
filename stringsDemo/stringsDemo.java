public class stringsDemo{
	public static void main(String[] args) {
		//Str1();
		Str2();
	}


	public static void Str2(){
		String mesaj = "Bugun hava cok guzel";
		System.out.println(mesaj);

		String yeniMesaj = mesaj.replace(" ","-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,4));

		for(String kelime : mesaj.split(" ")){
			System.out.println(kelime);
		}

	}

	public static void Str1(){
		String mesaj = "Bugun hava cok guzel";
		System.out.println(mesaj);

		System.out.println("Eleman sayisi: " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Yasasin!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0,5,karakterler,0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
	}
}