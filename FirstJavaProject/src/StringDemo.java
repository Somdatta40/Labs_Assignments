
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my. name. is. somdatta";
		String []words= str.split(". ",1);
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		System.out.println(str.LastIndexOf("a"));	

}
}

