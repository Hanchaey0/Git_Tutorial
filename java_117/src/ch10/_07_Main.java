package ch10;

public class _07_Main {

	/*
	 * 1. 강제예외발생 : throw new Exception(message);
	 * 2. 상위 메서드에게 예외 던지기
	 *    throws Exception
	 * 3. 예외 처리
	 *    catch(던진 Exception e){e.getMaessage()}로 받는다.
	 * 
	 * 기본 예외처리를 하는 exception클래스 블록이 여러예외처리 중 가장 아래에 자리하는것이 좋다.
	 * catch문이 여러개일때,(다중 catch) 부모 exception이 제일 아래오도록 하는 것이 좋다.
	 */
	public static void main(String[] args) {
		_07_IDFormat format = new _07_IDFormat();
		try {
			format.setUserID(null); //1
		} catch (_07_IDFormatException e) { //5. catch(Exception e): 예외처리
			System.out.println(e.getMessage());
		}finally {
			System.out.println( "==== finally ====");

		}

	}
}