package ch09;
//Member.424
import java.lang.reflect.Member;
import java.util.HashSet;
import java.util.Iterator;

public class _14_MemberHashSet {
	private HashSet<_14_Member> hashSet;

	public _14_MemberHashSet() {
		hashSet = new HashSet<_14_Member>();
	}
	public void addMember(_14_Member member) {
		hashSet.add(member);

	}
	public boolean removeMember(int memberId) {
		Iterator <_14_Member> ir = hashSet.iterator();

		while(ir.hasNext()) {
			_14_Member member = ir.next();
			int temId = member.getMemberId();
			if(temId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}


	public void showAllMember() {
		for(_14_Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
