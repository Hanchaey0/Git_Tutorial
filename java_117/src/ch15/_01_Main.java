package ch15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import ch15._01_Enum.Animal;

public class _01_Main {
public static void main(String[] args) {
	
	//매개변수 생성자를 통해 값 전달
	_01_Enum eu1 = new _01_Enum(Animal.CAT, "고양이");
	_01_Enum eu2 = new _01_Enum(Animal.DOG, "강아지");
	_01_Enum eu3 = new _01_Enum(Animal.FISH, "물고기");
	
	//리스트에 담는다
	List<_01_Enum>list = new ArrayList<_01_Enum>();
	list.add(eu1);
	list.add(eu2);
	list.add(eu3);
	
	//향상된 for문 (forEach문)으로 출력
	for(_01_Enum str : list) {
		System.out.println(str.getKind()+" "+str.getName());
	}
	
}
}
