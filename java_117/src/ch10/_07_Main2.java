package ch10;

public class _07_Main2 {
	public static void main(String[] args) {
		_07_IDFormat2 format = new _07_IDFormat2();
		try {
			format.setUserID("1234567"); //1
		} catch (_07_IDFormatException e) { //5. catch(Exception e): 예외처리
			System.out.println(e.getMessage());
		}finally {
			System.out.println( "==== finally ====");
		}
		
	}

}
