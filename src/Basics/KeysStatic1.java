package Basics;
/*
 *First-Static BLock
 *Second-Main Method
 *Third-NonStaticBlock
 *Fourth-Constructor
 */
public class KeysStatic1 {
     static {
    	 System.out.println("Static block");
     }
     {
    	 System.out.println("Non-Static block");
    	 
     }
	public static void main(String[] args) {
		KeysStatic obj=new KeysStatic();
		obj.print1();
		System.out.println(KeysStatic.number);
        KeysStatic.print();
	}

}
