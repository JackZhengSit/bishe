package learning.relations;

//������ϵ�������еı���Ϊ��
//1.�ֲ�����
//2.�����β�
//3.��̬��������
public class Dependency {
	public void fun1() {
		String str=new String();//�ֲ�����������
	}
	public void fun2(String str) { //��������������
		
	}
	public void fun3() {
		Integer.valueOf("100");//��̬����������
	}
}
