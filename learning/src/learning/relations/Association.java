package learning.relations;

//关联关系在类中的表现为在平等级的全局变量
//关联关系的对象生命周期不一定相同
public class Association {
	protected String str;//全局变量
	public Association(String str) {
		this.str=str;
	}
}
