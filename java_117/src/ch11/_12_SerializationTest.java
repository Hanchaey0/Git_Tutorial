package ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//552
public class _12_SerializationTest {
	/*직렬화
	 * - 인스턴스의 정보를 그대로 저장하거나 네트워크를 통해 전송
	 * - 인스턴스의 내용(멤버변수 값)을 연속 스트림으로 만드는 것이다.
	 * - 스트림으로 만들어야 파일에 쓸 수 있고, 네트워크로 전송할 수 있다.
	 * - 직렬화 구현 : implements Serializable
	 * - transient : 해당 멤버변수 정보는 직렬화나 복원과정에서 제외
	 * 
	 * 역직렬화
	 * - 저장된 내용이나 전송받은 내용을 다시 복원하는 것.
	 * 
	 * 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		_12_Person an = new _12_Person("안재용", "대표이사");
		_12_Person kim = new _12_Person("김철수", "상무이사");
		
	 try(FileOutputStream fos = new FileOutputStream("serial.out");
			 ObjectOutputStream oos = new ObjectOutputStream(fos)){
		 oos.writeObject(an);
		 oos.writeObject(kim);
	 }catch(IOException e) {
		 e.printStackTrace();
	 }
	
	 try(FileInputStream fis = new FileInputStream("serial.out");
			 ObjectInputStream ois = new ObjectInputStream(fis)){
		 _12_Person p1 = (_12_Person)ois.readObject();
		 _12_Person p2 = (_12_Person)ois.readObject();
		 
		 System.out.println(p1);
		 System.out.println(p2);
	 }catch (IOException e) {
		 e.printStackTrace();
	 }
	}
}
