package jiekou;

import java.util.Scanner;

public  class Doctor implements Student,Teacher {
      private double fee;                  //ÿѧ��ѧ��
      private double wage;                 //ÿ��нˮ
	public double getFee() {              //����ÿѧ��ѧ��
		return fee * 2;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getWage() {
		return wage ;                 //����������
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public  double pay(double x) {
		return x;
	}                                 //��д�ӿڵķ���
	public double cheak(double x) {
		return x;
	}
	public double fa(double x) {      
	    return x;
	}
	public  double cheakw(double x) {
		return x;
	}
	public void setFeeWagearg(String a,String b) {           //����ÿѧ�ڷ��ã�ÿ��нˮ
		  fee = Double.parseDouble(a);        //�ַ�������ת����double����
		  wage = Double.parseDouble(b);
		 }
	//ʹ��scanner����
	public void setFeeWages(Doctor stu) {
	  try{
	    System.out.println("���ѧ�������������Ա����䣬ѧ�Ѻ͹��ʣ�");  
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String name = in.next();
		String sex = in.next();
		int age = in.nextInt();
	    double fee = in.nextDouble();
	    double wage = in.nextDouble();
	    if(fee < 0 || wage < 0) {
	       throw new MyException("�������������Ҫ����0��");
	    }else {
	    System.out.println("�ò�ʿ"+ name +"(�Ա�" + sex +"����"+ age +")����ѧ���ǣ�"+fee * 2 +";"+"�������ǣ�"+wage *12);
	    //���ʺ�ѧ��֮��
	    double diff = wage * 12- fee * 2;
	    System.out.println("�깤�ʺ�ѧ��֮��:"+diff);
	    //��˰scanner
	    double Cwage = wage - Test.start;    //���
	    double tax = 0;   
	    if(Cwage > 0){
			if(Cwage <= 1500){
				tax = Cwage * 0.03;
			}else if(Cwage <= 4500){
				tax = 1500*0.03 + (Cwage-1500)*0.1;
			}else if(Cwage <= 9000){
				tax = 1500*0.03 + 3000*0.1 + (Cwage-4500)*0.2;
			}else if(Cwage <= 35000){
				tax = 1500*0.03 + 3000*0.1 + 4500*0.2 + (Cwage-9000)*0.25;
			}else if(Cwage <= 55000){
				tax = 1500*0.03 + 3000*0.1 + 4500*0.2 + 26000*0.25 + (Cwage -35000)*0.3;
			}else if(Cwage <= 80000){
				tax = 1500*0.03 + 3000*0.1 + 4500*0.2 + 26000*0.25 + 20000*0.3 + (Cwage-55000)*0.35;
			}else {
				tax = 1500*0.03 + 3000*0.1 + 4500*0.2 + 26000*0.25 + 20000*0.3 + 25000*0.35 + (Cwage-80000)*0.45;
			}
			System.out.println("��ѧ��Ӧ����˰Ϊ��"+tax * 12 );
		}else{
			System.out.println("����Ҫ��˰��");
			}
		}
	  }catch(MyException e){
		  System.out.println(e.getMessage());
	  }
	}
	//�������� ��������ʱͨ��main�����Ĳ���argsһ���Ը�ֵ
	public String setName(Doctor stu) {
		System.out.println("���ѧ������������");  
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String namea = in.next();
		return namea;
		}
	public void setTea(Doctor tea) {
		System.out.println("��ʦ������������������нˮ��");  
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String namet = in.next();
		String sext = in.next();
		System.out.println("��"+namet+"��ʦ��������");
     }
}

