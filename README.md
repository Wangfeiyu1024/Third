# Third
Java第三次实验
# 计G201+2020322060+王菲钰
# 实验名称 
### 接口程序实验  
## 实验目的  
1.掌握抽象类和抽象方法的定义  
2.了解异常的使用方法，并在程序中根据输入情况做异常处理     
3.掌握接口的定义，熟练掌握接口的定义形式以及接口的实现方法  
## 实验要求  
1.设计两个管理接口：    
 &ensp;&ensp;学生管理接口（缴纳学费、查学费抽象方法）  
 &ensp;&ensp;教师管理接口（发放薪水、查询薪水抽象方法）      
2.设计博士研究生类，实现上述的两个接口（属性：姓名、性别、年龄、每学期学费、每月薪水）      
3.编写测试类，实例化两名博士研究生，统计他们的年收入和学费    
4.根据两者之差（对年学费和年收入进行统计，用收入减去学费）求得纳税额算出每名博士研究生的年应纳税金额    
5.纳税算法依据国家最新工资纳税标准，方法用static  final修饰定义  
6.实例化研究生类时，采用运行时通过main方法的参数args一次性赋值以及采用Scanner类实现运行时交互式输入  
7.根据输入情况，要在程序中做异常处理    
## 实验过程  
  ### 1.建立包   
  * 在包中设置Doctor(博士研究生类),cheak（异常类）MyException（自定义异常类）  
  * Student(学生）,Teacher（老师），测试类Test    
  ### 2. Student接口类  
  * 方法：（抽象方法，接口中只能定义方法，没有方法体）  
  &ensp;&ensp; 缴纳学费  
  &ensp;&ensp; 查学费  
  ### 3. Teacher接口类 
   * 方法：（抽象方法）  
  &ensp;&ensp; 发放薪水  
  &ensp;&ensp; 查询薪水  
   ### 4.Doctor(博士研究生)类 【实现上述两个接口的方法】
   * 属性：number（学工号），name（姓名），sex（性别），age(年龄），fee(每学期学费），wage（每月薪水）  
   * 方法：    
     1）给上述fee,wage属性设置set()和get()方法,设置fee乘以2即年学费，wage乘以12即年工资    
     2）因为Doctor为非抽象类，所以重写接口的所有方法     
     3）设置args赋值工资学费的方法，可以实现一次性赋值：setFeeWagearg(String a,String b)   
     4）设置使用scanner让学生或老师输入自己的信息方法：setTea（）、setFeeWages(Doctor stu)    
     5）设置scanner输入下纳税方法    
     6）自定义异常（如果工资和学费输入负数，就抛出错误） 
  ### 5.cheak类
   * 方法：    
     设置cheak异常方法（金额不合法就扔出我的自定义异常类中的相关内容）   
 ### 6.MyException类
   * 方法：（自定义异常）     
     设置MyException方法，如果金额不符合要求即扔出信息  
     super父类Exception  
  ### 6.Test类
  * 实例化对象：调用scanner实例化老师，学生，cheak(异常）  
     老师：dtea0，dtea1     
     学生：dstu0，dstu1  
     异常：cheak  
  * 调用args赋值的方法（setFeeWagearg(），里面的参数从args[0]开始  
  * 调用cheak方法，捕获MyException中的异常  
  * 设置args输入下纳税方法并调用  
## 核心方法
（1）设置接口类  
```
   public interface Student {
	public abstract double pay(double x);              //缴纳学费
	public abstract double cheak(double x);           //查学费

}
```
（2）接口中的抽象方法定义     
```
public abstract double cheakw(double x);
 } 
```
（3）set和get方法的建立  
```
public double getFee() {              //返回每学年学费
		return fee * 2;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
```
（4）args一次性赋值方法      
```
public void setFeeWagearg(String a,String b) {           //设置每学期费用，每月薪水
		  fee = Double.parseDouble(a);        //字符串类型转换成double类型
		  wage = Double.parseDouble(b);
		 }
 ```
（5）scanner方法输入           
```
Scanner in = new Scanner(System.in);
		String name = in.next();
		String sex = in.next();
		int age = in.nextInt();
	    double fee = in.nextDouble();
	    double wage = in.nextDouble();
```
 (6)纳税          
```
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
```
 (7)异常               
```
 try{
	    double fee = in.nextDouble();
	    double wage = in.nextDouble();
	    if(fee < 0 || wage < 0) {
	       throw new MyException("输入错误！输入金额要大于0！");
	    }else {
	    System.out.println("该博士"+ name +"(性别" + sex +"年龄"+ age +")：年学费是："+fee * 2 +";"+"年收入是："+wage *12);
	    //工资和学费之差
	  }catch(MyException e){
		  System.out.println(e.getMessage());
	  }
	}
```
(8)实例化对象             
```
  Doctor dstu0;     
		dstu0 = new Doctor();  
```
(9)自定义异常            
```
try {
			cheak.check(dstu1.getWage());
			cheak.check(dstu1.getFee());
		}catch(MyException e){
			System.out.println("用户输入出现以下问题：");
			System.out.println(e.warnMess());
			System.exit(0);
		}
```
## 实验结果
### （1）scanner输入      
![alt console](http://m.qpic.cn/psc?/V528qTS74BHGMM1h1AFf33VeSW0R67RO/ruAMsa53pVQWN7FLK88i5qAtsQiHKh9q*r35qnmUUKy8MCX.FsnmSMUkyQgEqE05PMX*UKHCaK.V10L0s.33L.urdUOQ.mGQCZP9ee2.gwc!/b&bo=GQQlAQAAAAADBxs!&rf=viewer_4)   
### （2）args一次性赋值     
![alt console](http://m.qpic.cn/psc?/V528qTS74BHGMM1h1AFf33VeSW0R67RO/45NBuzDIW489QBoVep5mcT1R1.nCDtOLyEY1yPZYTFp.7lcD1O6FiYqsJJvwkEarqnwcWDZ8kO2OWP71xGHJMg66L7.R8Rs9he3WrzqqEIQ!/b&bo=CATsAAAAAAADF9I!&rf=viewer_4)     
### （3）异常处理      
![alt console](http://m.qpic.cn/psc?/V528qTS74BHGMM1h1AFf33VeSW0R67RO/45NBuzDIW489QBoVep5mcT1R1.nCDtOLyEY1yPZYTFoCeuLUbC6mFa7yl2S.JfL7W6X.vvjwbXP3dUlEIhA1CPRRDVS2r.slaeaXGcBE4jM!/b&bo=GQQlAQAAAAADFws!&rf=viewer_4)   
## 实验感想
  通过此次试验掌握了接口的定义以及实现，非抽象类实现接口必须重写所有方法，并且熟练掌握了args和scanner输入方法的设置，实例化对象调用。了解异常的使用方法，并在程序中根据用户输入情况做异常抛出处理。
