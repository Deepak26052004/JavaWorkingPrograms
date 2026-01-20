class CarCompanyObj
{
    public static void main(String[] args)
    {
        // Engines
        Engine1 e1 = new Engine1("600cc", "300hp", "Diesel", 4);
        Engine1 e2 = new Engine1("800cc", "200hp", "Petrol", 6);
        Engine1 e3 = new Engine1("400cc", "500hp", "Battery", 8);
        Engine1 e4 = new Engine1("1000cc", "700hp", "Diesel", 6);
        Engine1 e5 = new Engine1("1200cc", "900hp", "Petrol", 8);

        // Cars
        Car1 c1 = new Car1("Maruti", "White", 720000, e1);
        Car1 c2 = new Car1("BMW", "Black", 7620000, e2);
        Car1 c3 = new Car1("Suzuki", "Red", 200000, e3);
        Car1 c4 = new Car1("Tata Nexon", "Grey", 1500000, e4);
        Car1 c5 = new Car1("Audi", "Blue", 3500000, e5);

        // Showrooms
        Car1[] showroom1Cars = {c1, c2};
        Car1[] showroom2Cars = {c3, c4, c5};

        Showroom sr1 = Showroom.getShowRoomDetails("Mahesh Jayaram", "Marudhur", showroom1Cars);
        Showroom sr2 = Showroom.getShowRoomDetails("Ravi Kumar", "Chennai", showroom2Cars);

        // Company
        Showroom[] allShowrooms = {sr1, sr2};
        CarCompany company = new CarCompany("AutoKing Pvt Ltd", "R. Deepak", allShowrooms);

        // Display all details
        company.detailsOfCompany();
    }
}