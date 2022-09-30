package ch09;

import java.util.ArrayList;
import java.util.List;

//p410
public class _04_MemberArrayList {
	List<_06_Member> list; //디폴트 생성자에 갇혀있던 걸 위로 올려서 다같이 쓸 수 있게 빼 줌.
	public _04_MemberArrayList() {
		list = new ArrayList<_06_Member>();
	}

	//회원추가 메서드
	public void addMember(_06_Member member) {
		list.add(member);
	}
	//memberId = 1004일 때 삭제
	public boolean removeMember (int memberId) {
		for(int i=0;i<list.size();i++) {
			_06_Member member = list.get(i);
		if(member.getMemberId() == memberId) {
			list.remove(i); //해당회원을 삭제하라
			return true; //삭제 성공이면 삭제 종료.
		}
		}
		System.out.println();
		return false;
	}
	
	public void showMember() {
		//향상된 for문(자료형 변수 : list명){}
		//toString()호출
		for(_06_Member member : list) {
			System.out.println(member.toString());
		}
		System.out.println();
	}
}
