package ch02;

public class _21_ForEx {
	public static void main(String[] args) {
		
		String str = "no pain no gain";
		int count = 0;
		
		
		//str.charAt(i) == '찾는 문자'
		/*System.out.println("str의 길이 : ?");	//변수.length()
		Systme.out.println("str 문장에서 발견된 n의 갯수 : " + ?);*/
		
		
		for(int i=0; i<str.length(); i++) {
		   if(str.charAt(i) != 'n'){ 
		   	continue;  	//아래 문장을수행하지 않고, for문으로 올라가서 증가 후 계속 반복한다  
		   }
		   count++;
		}
			System.out.println("str의 길이 : "+str.length());
			System.out.println("str문장에서 발견된 n의 갯수 : " + count);
	}
}
			
		
	

