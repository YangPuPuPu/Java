package set;

public class Student1 {
	private String name;
	private int Chinese;
	private int math;
	public Student1(String name, int chinese, int math) {
		super();
		this.name = name;
		this.Chinese = chinese;
		this.math = math;
	}
	public Student1() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChinese() {
		return Chinese;
	}
	public void setChinese(int chinese) {
		this.Chinese = chinese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getSum() {
		return this.Chinese+this.math;
	}
}
