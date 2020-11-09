package jiekou;

public class Test {
	public static final int start=5000;
	//工资和学费之差
	public static double Diff(Doctor stu) {
		stu.getFee();
		stu.getWage();
		double diff = stu.getWage() * 12 - stu.getFee() * 2;
		return diff;	
	}
	//缴税arg
	public static void taxa(Doctor stu) {
		stu.getWage();
		double Cwage = stu.getWage() - start;    //起缴
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
			System.out.println("你应交的税为："+tax);
		}else{
			System.out.println("不需要缴税！");
			}
		}
	 
	public static void main(String[] args) {
		Doctor dstu0;     Doctor dtea0;
		Doctor dstu1;     Doctor dtea1;
		dstu0 = new Doctor();  dtea0 = new Doctor();
		dstu1 = new Doctor();  dtea1 = new Doctor();
		dtea0.setTea(dtea0);
		dstu0.setFeeWages(dstu0);
		System.out.println("-------------------------------------------");
		dtea1.setTea(dtea1);
		dstu1.setName(dstu1);
		dstu1.setFeeWagearg(args[0],args[1]);  //采用运行时通过main方法的参数args一次性赋值
		Cheak cheak = new Cheak();
		try {
			cheak.check(dstu1.getWage());
			cheak.check(dstu1.getFee());
		}catch(MyException e){
			System.out.println("用户输入出现以下问题：");
			System.out.println(e.warnMess());
			System.exit(0);
		}
		System.out.println("该研究生"+"：年学费为："+dstu1.getFee() * 2+"；"+"年收入为："+dstu1.getWage() * 12);
		System.out.println("工资和学费之差:"+Diff(dstu1));     
		taxa(dstu1);                          //调用缴税方法
	}
}

