class Sobj {
    public static void main(String[] args) {

        // Create Student objects
        Student s1 = new Student("Deepak", 100, 21);
        Student s2 = new Student("Ayush", 90, 23);
        Student s3 = new Student("Camgreen", 30, 26); // failed student
        Student s4 = new Student("Nathan", 70, 20);
        Student s5 = new Student("Ellis", 25, 17);   // failed student

        // Create array and store all objects
        Student[] s = new Student[5];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        s[3] = s4;
        s[4] = s5;

        // Print failed students (marks = 35)
        System.out.println("Students who failed (marks = 35):");
        for (int i = 0; i < s.length; i++) {
            if (s[i].getMarks() <= 35) {
                System.out.println(
                    "Name: " + s[i].getName() +
                    ", Marks: " + s[i].getMarks() +
                    ", Age: " + s[i].getAge()
                );
            }
        }
    }
}
