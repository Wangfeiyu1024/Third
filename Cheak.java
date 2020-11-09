package jiekou;

public class Cheak {
	public void check(double money) throws MyException {// 抛出自己的异常类 
	    if (money < 0 ) { 
	      // 金额不合法时抛出异常 
	      throw new MyException(money);// new一个自己的异常类 
	    } 
	}  
	}
