import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

	
	public static void getValueFromKey(Map<?,?> hm, Object o) {
		System.out.println(hm.get(o));
	}
	
	
	public static Object getKeyFromValue(Map<?,?> hm, Object value) {
		List<Object> list=new ArrayList<Object>();
		
		for(Object m:hm.keySet()) {
			if(hm.get(m).equals(value)) {
				list.add(m);
			}
		}
		Object valueToReturn = list.toString();
		return valueToReturn;
		
	}
	public static void main(String[] args) {
		Map<Integer, String> hmap=new HashMap<Integer, String>();
		hmap.put(10, "Vi");
		hmap.put(20, "Kee");
		System.out.println(getKeyFromValue(hmap, "Kee"));
		
		getValueFromKey(hmap, 10);
	}
}
