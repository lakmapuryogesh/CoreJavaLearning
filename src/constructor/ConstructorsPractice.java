package constructor;

class ConstructorsPractice {
    public int age=0;
	public static void main(String[] args) {
		ConstructorsPractice obj =new ConstructorsPractice(20);
		System.out.println("Helloo World"+obj.age);
	}
    public ConstructorsPractice(int a) {
    this.age=a;	
    }
    public ConstructorsPractice() {
    	age=20;
    }
}
