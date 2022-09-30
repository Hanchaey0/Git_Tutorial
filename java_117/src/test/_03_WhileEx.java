

package test;
 public class _03_WhileEx{

	public static void main(String[] args){
	
	int dan = 2;
	System.out.println("=========");
	System.out.println("구구단 출력");
	System.out.println("=========");

	while( dan < 10 ){
	System.out.println("*** "+dan+"단 ***");
	int i = 1;
	       while( i < 10 ){
		System.out.println(dan + " * " + i + " = " +(dan*i));
		i++;
		}
	dan++;
	}
  	System.out.println("**********");
	}
      }