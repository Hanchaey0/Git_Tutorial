package test;
 public class _04_WhileEx{

	public static void main(String[] args){
	
	int dan = 2;
	System.out.println("******************");
	System.out.println("** 구구단 출력 **");
	System.out.println("******************");

	while(dan<10){
	System.out.println("*** " + dan+"단 ***");

	       int num = 1;
	       while(num<10){
	       System.out.println(dan+" * "+num+" = "+(dan*num));
	       num++;
	       }
	dan++;
	}
	System.out.println("============");
	}
}
