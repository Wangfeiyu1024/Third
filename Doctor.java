package jiekou;

import java.util.Scanner;

public  class Doctor implements Student,Teacher {
      private double fee;                  //每学期学费
      private double wage;                 //每月薪水
	public double getFee() {              //返回每学年学费
		return fee * 2;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getWage() {
		return wage ;                 //返回年收入
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public  double pay(double x) {
		return x;
	}                                 //重写接口的方法
	public double cheak(double x) {
		return x;
	}
	public double fa(double x) {      
	    return x;
	}
	public  double cheakw(double x) {
		return x;
	}
	public void setFeeWagearg(String a,String b) {           //设置每学期费用，每月薪水
		  fee = Double.parseDouble(a);        //字符串类型转换成double类型
		  wage = Double.parseDouble(b);
		 }
	//使用scanner输入
	public void setFeeWages(Doctor stu) {
	  try{
	    System.out.println("请该学生输入姓名，性别，年龄，学费和工资：");  
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String name = in.next();
		String sex = in.next();
		int age = in.nextInt();
	    double fee = in.nextDouble();
	    double wage = in.nextDouble();
	    if(fee < 0 || wage < 0) {
	       throw new MyException("输入错误！输入金额要大于0！");
	    }else {
	    System.out.println("该博士"+ name +"(性别" + sex +"年龄"+ age +")：年学费是："+fee * 2 +";"+"年收入是："+wage *12);
	    //工资和学费之差
	    double diff = wage * 12- fee * 2;
	    System.out.println("年工资和学费之差:"+diff);
	    //缴税scanner
	    double Cwage = wage - Test.start;    //起缴
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
			System.out.println("该学生应交年税为："+tax * 12 );
		}else{
			System.out.println("不需要缴税！");
			}
		}
	  }catch(MyException e){
		  System.out.println(e.getMessage());
	  }
	}
	//输入名字 采用运行时通过main方法的参数args一次性赋值
	public String setName(Doctor stu) {
		System.out.println("请该学生输入姓名：");  
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String namea = in.next();
		return namea;
		}
	public void setTea(Doctor tea) {
		System.out.println("老师请您输入您的姓名和薪水：");  
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String namet = in.next();
		String sext = in.next();
		System.out.println("该"+namet+"老师的助教是");
     }
}

