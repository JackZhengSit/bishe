package learning.relations;

//��Ϲ�ϵ��һ��ǿ����������ۺϹ�ϵ
//����Ϲ�ϵ����Ķ��������������ͬ
public class Composition {
	public Leg leg;
	public Arm arm;
	public Head head;
	
	public void person() {
		leg=new Leg();//��Ϲ�ϵ��������ʾ��������Composition��ʵ������ʱ����Щ��Ҳ��ʾ����
		arm=new Arm();
		head=new Head();
	}
}
