import java.util.*;
public class JCF {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Deepak");
        a.add("Mahesh");
        a.add("Suriya");
        a.add("Udhaya Prakash");
        a.add("Vijay Bala");
        System.out.println(a);
        a.set(0,"Deepak Rajesh");
        a.set(1,"Mahesh Jayaraman");
        a.set(2, "Suriya R");
        a.set(3,"Udhaya Prakash Velumuragan");
        a.set(4,"Vijay M");
        System.out.println(a);

        System.out.println(a.size());

        System.out.println(a.get(0));
        a.remove(0);
        System.out.println(a);
        a.add(0, "Rachin");
        System.out.println(a);
        System.out.println(a.contains("Rachin"));
        System.out.println(a.contains("Deepak"));
        System.out.println(a.isEmpty());
        System.out.println(a.indexOf("Vijay M"));
        a.add("Mahesh Jayaraman");
        System.out.println(a.indexOf("Mahesh Jayaraman"));
        System.out.println(a.lastIndexOf("Mahesh Jayaraman"));
        ArrayList<String> b = new ArrayList<String>();
        b.add("Sanju");
        b.add("Ayush");
        b.add("Ruturaj");
        b.add("Cameron Green");
        b.add("Dewald Brevis");
        b.add("Shivam Dube");
        System.out.println("B Array:"+b);
        b.add(3, "Urvil Patel");
        System.out.println("B Array:"+b);
        b.set(3, "Urvil Patel (wk)");
        Collections.sort(b);
        System.out.println("B Array:"+b);
        Collections.sort(b,Collections.reverseOrder());
        System.out.println("B Array:"+b);
        b.forEach(x ->System.out.println(x));
System.out.println("*********************************");
        Iterator<String> var=b.iterator();
        while (var.hasNext()) {
            System.out.println(var.next());
        }
        b.removeIf(x -> x.startsWith("S"));
        System.out.println("B Array:"+b);

        b.replaceAll( x -> "Mr ."+x);
        System.out.println("B Array:"+b);
        


    }
}
