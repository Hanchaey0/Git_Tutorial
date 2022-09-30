package ch08;

public class _05_Point {
	int x;
	int y;
	
	public _05_Point() {}
	public _05_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		//원점 출력
		return "x="+ x+ ", "+"y="+y;
	}
}
