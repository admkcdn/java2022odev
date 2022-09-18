public class sesliHarfler{
	public static void main(String[] args) {
		String[] kalinSesli = {"a","ı","o","u"};
		String[] inceSesli = {"e","i","ö","ü"};
		String harf = "ü";

		for(String ses:inceSesli){
			if(ses.equals(harf.toLowerCase())){
				System.out.println(harf + " harfi ince sesli bir harftir.");
				break;
			}
		}

		for(String ses:kalinSesli){
			if(ses.equals(harf.toLowerCase())){
				System.out.println(harf + " harfi kalin sesli bir harftir.");
				break;
			}
		}
	}
}