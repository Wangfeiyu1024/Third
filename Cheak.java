package jiekou;

public class Cheak {
	public void check(double money) throws MyException {// �׳��Լ����쳣�� 
	    if (money < 0 ) { 
	      // ���Ϸ�ʱ�׳��쳣 
	      throw new MyException(money);// newһ���Լ����쳣�� 
	    } 
	}  
	}
