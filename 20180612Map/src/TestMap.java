import java.util.*;

public class TestMap {
	public static void main(String[] arg) {
//		Map<String, String> m = new HashMap<>();
//		Map<String, String> m = new TreeMap<>();	//키의 알파벳 순서
		Map<String, String> m = new LinkedHashMap<>();
		//추가: .put(key, value) value찾기 value = .get(key)
		
		m.put("다교", "신천동");
		m.put("상진", "신월동");
		m.put("범성", "장지동");
		
		System.out.println(m.get("다교"));
		
		
//--------------------첫번째 훑는 방법------------------------//		
//		Iterator<String> i = m.keySet().iterator();
		
		Set<String> set = m.keySet();	
//m.KeySet() : m에 저장된 entry(key, value)이 pair중 key만 모은 set
		
		Iterator<String> i = set.iterator();
		
		while(i.hasNext()) {
			String key = i.next();
			System.out.println(String.format("키 : %s, 값 : %s", key, m.get(key)));
		}
		
//----------------------두번째 방법--------------------------//
		for(String key : m.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, m.get(key)));
		}

//----------------------세번째 방법-------------------------//
		for(Map.Entry<String, String> s : m.entrySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", s.getKey(), s.getValue()));

		}
	}
}
