public class Child //extends Parent
{
	
	private String name;
	private String behavior;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBehavior() {
		return behavior;
	}
	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}
	@Override
	public String toString() {
		return "Parent [name=" + name + ", behavior=" + behavior + "]";
	}
	
}

/*public class Child extends Parent
{

}*/