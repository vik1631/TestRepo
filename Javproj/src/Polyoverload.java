
public class Polyoverload {
	
	
	public String searchKeyWord(String name) {
		System.out.println("search by keyword");
		return "gaming mice";
	}
	
	
	public int searchKeyWord(int num) {
		System.out.println("search by model");
		return num;
	}
	
	public static void main(String[] args) {
		Polyoverload pay=new Polyoverload();
		System.out.println(pay.searchKeyWord(120));
	}

}
