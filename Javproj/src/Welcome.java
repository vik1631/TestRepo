
public class Welcome {

	public static void main(String[] args) {
		int[] arr= {45, 65, 55, 75, 55 ,85, 65};
		
		for(int i=0; i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				
				if(arr[i]==arr[j] ){
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	
}
