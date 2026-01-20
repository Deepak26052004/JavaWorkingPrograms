public class Employee {
    //states
    String ename;
    String ejob;
    int empid;
    int mgr;
    static String founder="Deepak";

    // Constructors
    public Employee(String ename,String ejob, int empid, int mgr){
        this.ename=ename;
        this.ejob=ejob;
        this.empid=empid;
        this.mgr=mgr;
    }
    public void detailsOfEmployee(){
        System.out.println("Employee Name:"+ename);
        System.out.println("Employee Destination:"+ejob);
        System.out.println("Employee Id:"+empid);
        System.out.println("Manager Id:"+mgr);
        System.out.println("Founder:"+founder);
        System.out.println();
        }

    public static void main(String[] args) {
        Employee e1=new Employee("Deepak","Java FullStack Developer",102,203);
        Employee e2=new Employee("Mahesh","Java Developer",293,234);
        Employee e3=new Employee("Suriya","AI Developer",4564,7567);

        e1.detailsOfEmployee();
        e2.detailsOfEmployee();
        e3.detailsOfEmployee();
    }
}
