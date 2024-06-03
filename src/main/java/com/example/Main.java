package com.example;

public class Main {
    public static void main(String[] args) {
        // Create a new car object
        Car myCar = new Car("Toyota", "Camry", 2020, "Red", 24000.00);

        // Display car details
        myCar.displayCarDetails();

        // Modify car details
        myCar.setColor("Blue");
        myCar.setPrice(23000.00);

        // Display updated car details
        System.out.println("\nUpdated Car Details:");
        myCar.displayCarDetails();

        Bank myBank = new Bank("SBI","Charan", "APZN", 2000);
        myBank.displayAccountDetails();
        myBank.deposit(200);
        myBank.withdraw(150);
        myBank.setBalance(2150);
        System.out.println(myBank.getBankName());
        myBank.displayAccountDetails();
        Bike myBike =new Bike("TVS","Raidr 125",2013,"RED",97001);
        myBike.displayBikeDetails();
        myBike.updatePrice(100000);
        Student myStudent = new Student("Charan", 21, "APINDUS", "NO");
        myStudent.displayStudentDetails();
        myStudent.updateMajor("yes"); 
                }
       

}
