package test;
 public class _05_ForEx{
	public static void main(String[] args){

	int dan=1;
	int num=1;
	System.out.println("******************");
	System.out.println("** 구구단 출력 **");
	System.out.println("******************");

	for(dan=2; dan<=9; dan++){
	System.out.println("*** " + dan+"단 ***");
	
	    for(num=1; num<=9; num++){
	    System.out.println(dan+" * "+num+" = "+(dan*num));
	    }
	}
	System.out.println("============");
	}
}