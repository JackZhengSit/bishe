package learning.relations;

//依赖关系，在类中的表现为：
//1.局部变量
//2.方法形参
//3.静态方法调用
public class Dependency {
	public void fun1() {
		String str=new String();//局部变量型依赖
	}
	public void fun2(String str) { //方法参数型依赖
		
	}
	public void fun3() {
		Integer.valueOf("100");//静态方法型依赖
	}
}
