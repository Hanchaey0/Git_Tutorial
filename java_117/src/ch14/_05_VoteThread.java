package ch14;

import java.util.Random;

//지역별 개표율 현황
public class _05_VoteThread implements Runnable{
	int sum = 0; //총개표율
	int targetNum = 100;//개표율 100%
	Random random = new Random(); //개표율 속도
	
	@Override
	public void run() {
		StringBuffer sb = new StringBuffer(); //*모양의 그래프를 출력하기 위함 => 개표율의 갯수를 *의 갯수로 출력
		while(true) {
			sum += random.nextInt(10); //총 개표율 : 10까지의 난수 발생숫자를 누적
			sb.delete(0, sb.length()); //0으로 초기화
			
			if(sum >= targetNum) {
				sum = 100;
				for(int i=0; i<sum; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName()+"개표율 : "+sum+"\t"+sb);
				break;
			}else {
				for(int i=0; i<sum; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName()+"개표율 : "+sum+"\t"+sb);
			}
		try{
			Thread.sleep(500);  //sleep(1000밀리초)간격:1초 500이면 0.5초마다 결과를 보여줘라 cpu시간을 다른 스레드에게 넘겨주는 효율적인 방법이다. 현작업을 중지하고 넘겨준다.
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		}

		
		
	}
	

}
