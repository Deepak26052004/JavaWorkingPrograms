public class ClassB {
    static int r=20;
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        display();
        System.out.println(ClassA.x);
        System.out.println(r);
        System.out.println(ClassA.x);
        System.out.println("Tata Bye Bye See you later");
    }
    static{
        System.out.println("Mars");
    }
    public static void display(){
        System.out.println("Venus");
    }
}
