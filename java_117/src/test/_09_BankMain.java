package test;
 public class _09_BankMain{
  public static void main(String[] args){

//매개변수 생성자로 멤버변수 초기화
  _09_Bank[] bankarr = new _09_Bank[3];
  bankarr [0] = new _09_Bank("우리은행",10000,"강남구 대치동");
  bankarr [1] = new _09_Bank("신한은행",20000,"관악구 신림동");
  bankarr [2] = new _09_Bank("국민은행",30000,"금천구 시흥동");

  for(int i=0; i<bankarr.length;i++){
      bankarr[i].printInfo();
  }
}
}
 /*은행명 : 우리은행, 잔고 : 10000, 위치 : 강남구 대치동
      은행명 : 신한은행, 잔고 : 20000, 위치 : 관악구 신림동
      은행명 : 국민은행, 잔고 : 30000, 위치 : 금천구 시흥동
 */
