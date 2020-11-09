package jiekou;

public class MyException extends Exception  {
	private static final long serialVersionUID = 1L;
	String message; 
	public MyException(double money) {
		  message = "该学生输入不合法，金额应该是大于0";
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
