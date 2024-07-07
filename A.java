class A{
static void m(){
	System.out.println("m");
}
	

public static void main(String[] args){
		System.out.println(Thread.currentThread());
		m();
System.out.println("end");
	}
}