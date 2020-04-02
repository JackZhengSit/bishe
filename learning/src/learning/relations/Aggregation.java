package learning.relations;

//聚合关系和关联关系类似，不同的是类与类之间的关系变成了整体和个体
//聚合关系的对象生命周期不一定相同
public class Aggregation {
	public String str;
	public StringBuffer strbf;
	
	public Aggregation(String str,StringBuffer strbf) {
		this.str=str;
		this.strbf=strbf;
	}
}
