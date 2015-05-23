
public class zad1 {

	public static void main(String[] args) {
		String[] address={"Ivan Ivanov","BG","Vratsa","3000","Nartsis 666"};
		String formattedAddress=formatAddress(address);
		System.out.println(formattedAddress);

	}
	public static String formatAddress(String[] addr){
		String text=String.format("%s,%s\n%s %s,ul. %s", addr[0],addr[1],addr[2],addr[3],addr[4]);
		
		return text;
	}
}
