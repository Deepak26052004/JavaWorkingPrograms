class University {
    String uniName, location;
    Department[] departments;

    University(String uniName, String location, Department[] departments) {
        this.uniName = uniName;
        this.location = location;
        this.departments = departments;
    }

    public void detailsOfUniversity() {
        System.out.println("University Name: " + uniName);
        System.out.println("Location: " + location);
        System.out.println("===================================");
        for (Department d : departments) {
            d.detailsOfDepartment();
        }
    }
}