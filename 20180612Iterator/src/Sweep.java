import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> set;
		//set = new TreeSet<>();	//���ĺ� ������ ���ĵǾ� ����.
		//set = new HashSet<>();	//�ؽ��Լ� ������ ---- ��������>_<
		set = new LinkedHashSet<>();//�Է� ������ ���´�!!
		//�⺻ �޼ҵ� add(), remove(), sweep....
		
		set.add("Ʈ����");
		set.add("����");
		set.add("����");
		set.add("��ǥ");
		
		//----------------------ù��° �ȴ� ���!~!------------------//
		Iterator<String> itr = set.iterator();	//�� ���� �ȱ� ���� iterator(�ݺ���)�� �����ȴ�.
		//�������̽��� �ϳ�. ��Ʈ�� �����Ŵϱ� <String>�־��ش�
		
		while(itr.hasNext())	//hasNext�� ���� ���Ұ� ���� ���!!
		{
			String str = itr.next();	//�ϳ��� ������.
			System.out.println(str);
			
		}
		System.out.println("");
		//----------------�ι�° �ȴ� ���: for�� ���(�迭���� ��밡��)----------//
		for (String str1 : set) {	//for (������ ������ : �� ����)
			System.out.println(str1);
		}
		
	}

}
