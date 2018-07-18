
public class DupeCharac {
	
	public static void dupe(String str) {
		
		
		char[] ch=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			for(int j=i+1; j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
				}
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		dupe("madam");
	}

}
