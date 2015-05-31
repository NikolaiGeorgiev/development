
public class zad2 {

	public static void main(String[] args) {
		String letters="Chocolate";
		String fword=backwards(letters);
		System.out.println(fword);
	}
	public static String backwards(String word){
		int n=word.length(),i;
		String newWord = new String();
		for(i=0;i<n;i++){
			newWord=newWord+word.charAt(n-i)+"";
		}return newWord;
	}
}
