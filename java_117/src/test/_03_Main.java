package test;

 public class _03_Main{
 public static void main(String[] args){
 
  _03_Book [] lib = new  _03_Book[5];

 lib [0] = new  _03_Book("태","김",20000);
 lib [1] = new  _03_Book("이","박",30000);
 lib [2] = new  _03_Book("정","이",40000);
 lib [3] = new  _03_Book("안","류",50000);
 lib [4] = new  _03_Book("휴","최",60000);

 for(int i=0; i<lib.length;i++){
     lib[i].showBookInfo();
 }
}
}
