class Department {
    String deptName, hod;
    Professor[] professor;

    Department(String deptName, String hod, Professor[] professor) {
        this.deptName = deptName;
        this.hod = hod;
        this.professor = professor;
    }

    public void detailsOfDepartment() {
        System.out.println("===== Department Details =====");
        System.out.println("Department Name: " + deptName);
        System.out.println("HOD Name: " + hod);
        System.out.println("===== Professors in Department =====");
        
        for (Professor p : professor) {
            p.detailsOfProfessor();
        }
    }
}
