
public class ArrayDemo {
	
	public static void bubleSort(int[] arr) {
		
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		for(int k=0;k<=arr.length-1;k++) {
			System.out.println(arr[k]);
		}
	}
	
	public static void main(String[] args) {
		int[] array= {10,40,30,50,20};
		bubleSort(array);
	}

}
