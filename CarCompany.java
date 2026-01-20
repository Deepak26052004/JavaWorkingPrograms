class CarCompany
{
    private String companyName, ceo;
    private Showroom[] showrooms;

    CarCompany(String companyName, String ceo, Showroom[] showrooms) {
        this.companyName = companyName;
        this.ceo = ceo;
        this.showrooms = showrooms;
    }

    public void detailsOfCompany() {
        System.out.println("===============================================");
        System.out.println("Company Name: " + companyName);
        System.out.println("CEO Name: " + ceo);
        System.out.println("Total Showrooms: " + showrooms.length);
        System.out.println("===============================================");
        
        for (int i = 0; i < showrooms.length; i++) {
            Showroom sr = showrooms[i];
            sr.detailsOfShowRoom();
            System.out.println("\tCars in " + sr.getBranch() + " Showroom:");
            for (Car1 car : sr.getCars()) {
                car.detailsOfCar();
            }
        }
    }
}

