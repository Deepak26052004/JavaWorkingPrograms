class Subject {
    String subject_code, subject_name;
    int credits;

    Subject(String subject_code, String subject_name, int credits) {
        this.subject_code = subject_code;
        this.subject_name = subject_name;
        this.credits = credits;
    }

    public void detailsOfSubject() {
        System.out.println("==== Subject Details ====");
        System.out.println("Subject Code: " + subject_code);
        System.out.println("Subject Name: " + subject_name);
        System.out.println("Credits: " + credits);
        System.out.println("-------------------------");
    }
}
