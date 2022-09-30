package test;
public class _08_Main{
	public static void main(String[] args){

		_08_Worker csg = new _08_Worker("최슬기", 10000);
		_08_Worker kth = new _08_Worker("김태희", 20000);//똑같은 워커 입력


			

		_08_WooriBank wi = new _08_WooriBank("우리은행"); //new생성자 입력 필수
		csg.wooriDeposit(wi);

		wi.printInfo();

		_08_ShinhanBank sb = new _08_ShinhanBank("신한은행");
		kth.shinhanDeposit(sb);
		sb.printInfo();
		csg.printInfo();
		kth.printInfo();
	}
}


