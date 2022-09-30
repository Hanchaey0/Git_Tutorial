package ch11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//548
//자료형을 유지해서 자장하기위해 dataInputStream 과 dataOutputStream을 보조스트림으로 사용한다.
public class _11_DataStream {
	//11_data.txt
	//각 자료형에 맞게 data를작성
	//파일명(11_data.txt)이 동일해야한다. 작성된 파일을 읽어야 하므로
	//각 자료형에 맞게 data를 읽어서 콘솔에 출력
	//파일에 쓴 순서와 같은순서, 같은 메서드로 읽어야 한다.
	public static void main(String[] args) throws IOException {

		try(FileOutputStream fos = new FileOutputStream("D:\\dev117\\test\\11_FileReader.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		}catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("D:\\dev117\\test\\11_FileReader.txt");
				DataInputStream dis = new DataInputStream(fis)){
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}



}
