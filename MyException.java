package jiekou;

public class MyException extends Exception  {
	private static final long serialVersionUID = 1L;
	String message; 
	public MyException(double money) {
		  message = "��ѧ�����벻�Ϸ������Ӧ���Ǵ���0";
	}
	public String warnMess() { 
	     return message; 
	} 
	public MyException() {
	     super();
	}
	public MyException(String str) {
	     super(str);
	}
}
