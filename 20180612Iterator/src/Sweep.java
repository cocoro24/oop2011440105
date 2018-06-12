import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> set;
		//set = new TreeSet<>();	//알파벳 순으로 정렬되어 저장.
		//set = new HashSet<>();	//해쉬함수 순서로 ---- 순서몰랑>_<
		set = new LinkedHashSet<>();//입력 순으로 나온당!!
		//기본 메소드 add(), remove(), sweep....
		
		set.add("트럼프");
		set.add("정은");
		set.add("재인");
		set.add("준표");
		
		//----------------------첫번째 훑는 방법!~!------------------//
		Iterator<String> itr = set.iterator();	//이 셋을 훑기 위한 iterator(반복자)가 생성된당.
		//인터페이스의 하나. 스트링 훑을거니까 <String>넣어준당
		
		while(itr.hasNext())	//hasNext는 다음 원소가 있을 경우!!
		{
			String str = itr.next();	//하나씩 빼낸당.
			System.out.println(str);
			
		}
		System.out.println("");
		//----------------두번째 훑는 방법: for문 사용(배열에도 사용가능)----------//
		for (String str1 : set) {	//for (변수형 변수명 : 셋 변수)
			System.out.println(str1);
		}
		
	}

}
