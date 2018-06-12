import java.util.*;

public class TestMap {
	public static void main(String[] arg) {
//		Map<String, String> m = new HashMap<>();
//		Map<String, String> m = new TreeMap<>();	//Ű�� ���ĺ� ����
		Map<String, String> m = new LinkedHashMap<>();
		//�߰�: .put(key, value) valueã�� value = .get(key)
		
		m.put("�ٱ�", "��õ��");
		m.put("����", "�ſ���");
		m.put("����", "������");
		
		System.out.println(m.get("�ٱ�"));
		
		
//--------------------ù��° �ȴ� ���------------------------//		
//		Iterator<String> i = m.keySet().iterator();
		
		Set<String> set = m.keySet();	
//m.KeySet() : m�� ����� entry(key, value)�� pair�� key�� ���� set
		
		Iterator<String> i = set.iterator();
		
		while(i.hasNext()) {
			String key = i.next();
			System.out.println(String.format("Ű : %s, �� : %s", key, m.get(key)));
		}
		
//----------------------�ι�° ���--------------------------//
		for(String key : m.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, m.get(key)));
		}

//----------------------����° ���-------------------------//
		for(Map.Entry<String, String> s : m.entrySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", s.getKey(), s.getValue()));

		}
	}
}
