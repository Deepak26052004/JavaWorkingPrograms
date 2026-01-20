public class UniversityApp {
    public static void main(String[] args) {
        Subject s1 = new Subject("CS101", "Java Programming", 4);
        Subject s2 = new Subject("CS102", "Data Structures", 3);
        Subject s3 = new Subject("EC201", "Digital Electronics", 3);
        Subject s4 = new Subject("EC202", "Microprocessors", 4);

        Professor p1 = new Professor("Karthik", 90000, s1);
        Professor p2 = new Professor("Anitha", 85000, s2);
        Professor p3 = new Professor("Ramesh", 95000, s3);
        Professor p4 = new Professor("Divya", 88000, s4);

        Professor[] pr1={p1,p2};
		Professor[] pr2={p3,p4};
        Department d1 = new Department("Computer Science", "Dr. Priya", pr1);
        Department d2 = new Department("Electronics", "Dr. Ramesh", pr2);

        Department d[]={d1,d2};
        University u = new University("Anna University", "Chennai", d);
		
        u.detailsOfUniversity();
    }
}
