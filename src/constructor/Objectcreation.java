package constructor;

public class Objectcreation {
	public int a=10;
	public int b=15;
	public Objectcreation() {
		
	}
	public Objectcreation(int a) {
		this.a=a;
	}
	public Objectcreation(int a,int b) {
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Objectcreation obj=new Objectcreation();
         Objectcreation obj1=new Objectcreation(45);
         Objectcreation obj2=new Objectcreation(45,69);
         
         System.out.println(obj.add());
         System.out.println(obj1.add());
         System.out.println(obj2.add());
         
         
	}
	public int add() {
		return a+b;
	}

}
