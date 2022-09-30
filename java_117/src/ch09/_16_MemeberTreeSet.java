package ch09;

import java.util.Iterator;
import java.util.TreeSet;

//426
public class _16_MemeberTreeSet {
	private TreeSet<_16_Member> tree;
	
	public _16_MemeberTreeSet() {
		tree =  new TreeSet<_16_Member>();
	}

	public void addMember(_16_Member mem) {
		tree.add(mem);
	}
	public boolean removeMember (int memberId) {
		Iterator<_16_Member> i = tree.iterator();
		
		while(i.hasNext()) {
			_16_Member mem = i.next();
			int tempId = mem.getMemberId();
			if(tempId == memberId) {
				tree.remove(mem);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	public void showallMember() {
		for(_16_Member mem : tree) {
			System.out.println(mem);
		}
		System.out.println();
	}
	
}
