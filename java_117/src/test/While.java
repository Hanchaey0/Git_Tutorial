package test;
 public class While{
	public static void main(String[] args){
	
	
	System.out.println("************");
	System.out.println("**구구단 출력**");
	System.out.println("************");

	int dan = 2;

	while ( dan <10 ){
	 System.out.println("=============");
	 System.out.println("***"+ dan +"단 출력 ***");
	 System.out.println("=============");
		int i = 1;
		while ( i < 10 ){
	 System.out.println(dan + " * " + i +"="+(dan*i));
	 	i++;
	 }
	 dan++;
 	}
	System.out.println("=============");
         }
       }