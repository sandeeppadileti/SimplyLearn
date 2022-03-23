public class innerClassAssisted1 {

	 private String msg="Hello There!!!"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+" We have Successfully completed first Inner Classe");}  
	 }  


	public static void main(String[] args) {

		innerClassAssisted1 obj=new innerClassAssisted1();
		innerClassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}
