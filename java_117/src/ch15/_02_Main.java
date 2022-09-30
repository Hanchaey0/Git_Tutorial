package ch15;

public class _02_Main {
public static void main(String[] args) {

	
	System.out.println(_02_Week.SUN);
	System.out.println(_02_Week.SUN.ordinal());
	System.out.println(_02_Week.SAT.ordinal());
	
	System.out.println("===================");
	
	//switch case index값 이용해서 요일을 출력
	String weekend = "";
	switch(_02_Week.FRI.ordinal()) {
	case 0 :
		weekend = "일요일";
		break;
	case 1 :
		weekend = "월요일";
		break;
	case 2 :
		weekend = "화요일";
		break;
	case 3 :
		weekend = "수요일";
		break;
	case 4 :
		weekend = "목요일";
		break;
	case 5 :
		weekend = "금요일";
		break;
	case 6 :
		weekend = "토요일";
		break;
	}
	System.out.println("요일 : " + weekend); //요일 : 금요일
	System.out.println();
	
	System.out.println("========================");
	switch(_02_Week.TUES) {
	case SUN :
		weekend = "일요일";
		break;
	case MON :
		weekend = "월요일";
		break;
	case TUES :
		weekend = "화요일";
		break;
	case WED :
		weekend = "수요일";
		break;
	case THR :
		weekend = "목요일";
		break;
	case FRI :
		weekend = "금요일";
		break;
	case SAT :
		weekend = "토요일";
		break;
	}
	System.out.println("요일 : " + weekend); //요일 : 화요일
	System.out.println();
}

}
