package test;

	public class _13_SungjukImpl implements	_13_Sungjuk {

		int total;
		
		@Override
		public int getTotal(int kor, int eng, int math) {
			total=kor+eng+math;
			System.out.println("총점 : "+total);
			return total;
		}
		@Override
	   public int getAvg() {
			int avg=total/3;
			System.out.println("평균 : "+avg);
			return avg;
	   }
	   }