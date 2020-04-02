package learning.relations;

//组合关系是一种强依赖的特殊聚合关系
//有组合关系的类的对象的生命周期相同
public class Composition {
	public Leg leg;
	public Arm arm;
	public Head head;
	
	public void person() {
		leg=new Leg();//组合关系在类中有示例化，在Composition被实例化的时候，这些类也被示例化
		arm=new Arm();
		head=new Head();
	}
}
