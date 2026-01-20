import java.util.*;
public class interview {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("**************************************************************");
        System.out.println("Simple Calculator with History in Java");
        System.out.println("**************************************************************");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Show History\n6. Exit");
        System.out.print("Select Your option:");
        int option=sc.nextInt();
        switch (option) {
            case 1:
                performOperation("Add");
                break;
            case 2:
                performOperation("Subtract");
                break;
            case 3:
                performOperation("Multiply");
                break;
            case 4:
                performOperation("Divide");
                break;
            case 5:
                performOperation("Show History");
                break;
            case 6:
                System.out.println("Tata Bye Bye see you again!!!");
                break;
            default:
                System.out.println("Invalid option");
        }

    }
    public static void performOperation(String msg){
        System.out.println("Number 1:");
        double num1=sc.nextInt();
        System.out.println("Number 2:");
        double num2=sc.nextInt();
        ArrayList<double> history = new ArrayList<>();
        switch (msg) {
            case "Add":
                double res1=num1+num2;
                System.out.println("Addition of "+num1+" and "+num2+" is :"+res1);
                history.add(res1);
                break;
            
            case "Subtract":
                double res2=num1-num2;
                System.out.println("Subtraction of "+num1+" and "+num2+" is :"+res2);
                history.add(res2);
                break;
            case "Multiply":
                double res3=num1*num2;
                System.out.println("Multiplication of "+num1+" and "+num2+" is :"+res3);
                history.add(res3);
                break;
            case "Divide":
                double res4=num1/num2;
                System.out.println("Division of "+num1+" and "+num2+" is :"+res4);
                history.add(res4);
                break;
            case "Show History":
                if(history.isEmpty()){
                    System.out.println("History List is empty");
                }
                else{
                     for (int i = 0; i < 5 && i < history.size(); i++) { 
                         System.out.println(list.get(i));
                     }
                }
            default:
                System.out.println("Invalid Operation");
                break;
        }
        

    }

}