package test;
 public class _07_Sungjuk{

//1.멤버변수

 private int music;
 private int history;
 private int chemistry;

//2. 디폴트 생성자
public _07_Sungjuk(){
}

//3. 매개변수 생성자
public _07_Sungjuk(int music, int history, int chemistry){
 this.music = music;
 this.history = history;
 this.chemistry = chemistry;
}

//4.set/get메서드
 public void setMusic(int music){
         this.music = music;
}
 public int getMusic(){
         return music;
}
public void setHistory(int history){
         this.history = history;
}
 public int getHistory(){
         return history;
}
 public void setChemistry(int chemistry){
         this.chemistry = chemistry;
}
 public int getChemistry(){
         return chemistry;
}
 public int getCalSum(){
         int calSum=music+history+chemistry;
         return calSum;
}
 public int getCalAvg(){
         int calAvg=getCalSum()/3;
         return calAvg;
}
 public char getCalGrade(){
         char grade = ' '; 
         switch (getCalAvg()/10){
	case 10 :
	case 9 : grade ='A';
		break;
	case 8 : grade = 'B';
		break;
	case 7 : grade = 'C';
		break;
	case 6 : grade = 'D';
		break;
	default : grade = 'F';
	}
 return grade;
}


//5. printInfo
 public void printInfo(){
	System.out.println("음악 : "+getMusic());
	System.out.println("역사 : "+getHistory());
	System.out.println("화학 : "+getChemistry());
	System.out.println("총점 : "+getCalSum());
	System.out.println("평균 : "+getCalAvg());	
	System.out.println("학점 : "+getCalGrade());
 }
}

