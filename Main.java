
/*OVERRIDING MAIN CLASS*/  /*NOTE:it can override instance method but can't override static members*/
package instance.co;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj=new child();
		obj.display();//override instance through object and print child class info

	}

}
//static method doesnt override
