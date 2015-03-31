package testJ;

import java.io.ObjectInputStream.GetField;

class ErrorMsg{
	String msg[]={
		"Index out of memory",
		"Disk Error",
		"Input Error",
		"Disk failure"
	};
	
	static final int INDERR=0;
	final int DISKERR=1;
	final int INERR=2;
	final int DISKF=3;
	
	String getErr(int i){
		if(i>=0&i<msg.length)return msg[i];
		return "invalid num Err";
	}
	
}

public class FinakD {

	public static void main(String[] args) {
		ErrorMsg errorMsg=new ErrorMsg();
		
		System.out.println(errorMsg.getErr(errorMsg.DISKERR));
		System.out.println(errorMsg.getErr(ErrorMsg.INDERR));
		System.out.println(errorMsg.getErr(errorMsg.DISKF));

	}

}
