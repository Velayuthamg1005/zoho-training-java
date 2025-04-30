package OOPS;

import java.util.Scanner;

public class ProblemsInOops {
    public static void main(String[] args) {
        System.out.println("-----Introduction to OOPS-----");
    }
}

/*  

Create a Student class with attributes name, age, and grade,
Write a program to add a student and display their details.

*/

class Student{
    String name;
    int age;
    String grade;

    void display(){
        System.out.println("Name: " +name+ ", "+ "Age: "+age+ ", " +"Grade: "+grade);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        Student stud=new Student();

        System.out.print("Name: ");
        stud.name=sc.nextLine();

        System.out.print("Age: ");
        stud.age=sc.nextInt();

        sc.nextLine();

        System.out.print("Grade: ");
        stud.grade=sc.nextLine();

        stud.display();
    }
}

/* 

Write a program with a Book class that uses a parameterized constructor 
to initialize title, author, and price, and then display the book details.

*/

class Book{
    String title;
    String author;
    double price;

    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void display(){
        System.out.print("Title: "+title+ ", " +"Author: "+author+", " +"Price: "+price);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Title: ");
        String title=sc.nextLine();

        System.out.print("Author: ");
        String author=sc.nextLine();

        System.out.print("Price: ");
        double price=sc.nextDouble();

        Book bk=new Book(title,author,price);

        bk.display();

    }
}

/*

Create an Employee class with attributes name, position, and salary. 
Write a program to add an employee and display their details. 

*/

class Employee{
    String name;
    String position;
    double salary;

    Employee(String name,String position,double salary){
        this.name=name;
        this.position=position;
        this.salary=salary;
    }

    public void display(){
        System.out.println("Name: "+name+ ", "+"Position: "+position+", "+"Salary: "+salary);
    }
}

class Main{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Name: ");
        String name=sc.nextLine();

        System.out.print("Position: ");
        String position=sc.nextLine();

        System.out.print("Salary: ");
        double salary=sc.nextDouble();

        Employee emp=new Employee(name, position, salary);

        emp.display();
    }
}

/*

Write a Rectangle class with attributes length and width. Add methods to calculate area and perimeter.

*/

class Rectangle{
    int length;
    int breadth;

    static int findArea(int length,int breadth){
        return length*breadth;
    }

    static int findPeri(int length,int breadth){
        return 2*(length+breadth);
    }

    public void displayResult(){
        System.out.print("Area: "+findArea(length, breadth)+", "+"Perimeter: "+findPeri(length, breadth));

    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Rectangle rect=new Rectangle();

        System.out.print("Length: ");
        rect.length=sc.nextInt();

        System.out.print("Breadth: ");
        rect.breadth=sc.nextInt();

        rect.displayResult();
        
    }
}

/*

Create a Circle class with an attribute radius. Write methods to calculate area and circumference.

*/

class Circle{
    int radius;

    final double findArea(){
        return 3.14*radius*radius;
    }

    final double findCircumference(){
        return 2*3.14*radius;
    }

    public void display(){
        System.out.print("Area: "+findArea()+", "+"Perimeter: "+findCircumference());
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Circle c=new Circle();

        System.out.print("Radius: ");
        c.radius=sc.nextInt();

        c.display();

    }
}

/*

Write a Car class with attributes make, model, and year. Add a method to display car details.

*/

class Car{
    String make;
    String model;
    int year;

    public void display(){
        System.out.print("Car: "+make+" "+model+" " +year);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Car makeCar=new Car();

        System.out.print("Make: ");
        makeCar.make=sc.nextLine();

        System.out.print("Model: ");
        makeCar.model=sc.nextLine();

        System.out.print("Year: ");
        makeCar.year=sc.nextInt();

        makeCar.display();
    }
}


// Using Inheritance Concept

class InheritanceDemo {

    static class Vehicle {
        protected String make;
        protected String model;
        protected int year;

        public Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void displayDetails() {
            System.out.println("Vehicle Details:");
            System.out.println("Make  : " + make);
            System.out.println("Model : " + model);
            System.out.println("Year  : " + year);
        }
    }

    static class Car extends Vehicle {
        private boolean isElectric;

        public Car(String make, String model, int year, boolean isElectric) {
            super(make, model, year); 
            this.isElectric = isElectric;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Electric: " + (isElectric ? "Yes" : "No"));
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Hyundai", "Ioniq 5", 2022, true);
        Car car2 = new Car("Toyota", "Qualis", 2010, false);
        car1.displayDetails();
        car2.displayDetails();
    }
}


/*

Write a program using a Product class to manage an inventory. 
Allow adding products with attributes name, quantity, and price

*/

class Inventory{
    String name;
    int quantity;
    double price;

    public void display(){
        System.out.print(name+" "+"Quantity: "+quantity+", "+"Price:"+price);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Inventory product=new Inventory();

        System.out.print("Name: ");
        product.name=sc.nextLine();

        System.out.print("Quantity: ");
        product.quantity=sc.nextInt();

        System.out.print("Price: ");
        product.price=sc.nextInt();

        product.display();
    }
}

/*

Build a library system using a Book class with attributes title, author, and availability. 
Allow checking out and returning books.

*/

class LibrarySystem{
    String title;
    String author;

    public void display(){
        System.out.print(title+" by "+author);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LibrarySystem lib=new LibrarySystem();

        System.out.print("Title: ");
        lib.title=sc.nextLine();

        System.out.print("Author: ");
        lib.author=sc.nextLine();

        lib.display();
    }
}

// Booking.java
class Booking {
    private String title;
    private String author;
    private boolean isAvailable;

    public Booking(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    
    public void displayDetails() {
        String availability = isAvailable ? "Available" : "Checked Out";
        System.out.println("Book: " + title + " by " + author + " (" + availability + ")");
    }

    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully checked out \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is already checked out.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have successfully returned \"" + title + "\".");
        } else {
            System.out.println("\"" + title + "\" was not checked out.");
        }
    }
}


class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();

        Booking book = new Booking(title, author);

        System.out.println();
        book.displayDetails();

        System.out.println("\nWhat would you like to do?");
        System.out.println("1. Check Out Book");
        System.out.println("2. Return Book");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.println();
        if (choice == 1) {
            book.checkout();
        } else if (choice == 2) {
            book.returnBook();
        } else {
            System.out.println("Invalid choice.");
        }

        System.out.println();
        book.displayDetails();
    }
}


/*

Create a class to store student marks for 3 subjects. Add a method to calculate the average marks.

*/

// Student.java
class StudentMarks {
    private int mathMarks;
    private int scienceMarks;
    private int englishMarks;

    public StudentMarks(int mathMarks, int scienceMarks, int englishMarks) {
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }

    public double calculateAverage() {
        int total = mathMarks + scienceMarks + englishMarks;
        return total / 3.0; 
    }

    public void displayMarks() {
        System.out.println("Math: " + mathMarks);
        System.out.println("Science: " + scienceMarks);
        System.out.println("English: " + englishMarks);
    }
}


class StudentMarksMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Math Marks: ");
        int math = scanner.nextInt();

        System.out.print("Enter Science Marks: ");
        int science = scanner.nextInt();

        System.out.print("Enter English Marks: ");
        int english = scanner.nextInt();

        StudentMarks student = new StudentMarks(math, science, english);

        double average = student.calculateAverage();
        System.out.println("\nAverage Marks = " + (int)average); 
    }
}

/*

Create a TravelPackage class with attributes destination, days, and cost. 
Add methods to display and update package details.

Sample Input:
Destination: Paris
Days: 7
Cost: 1500

Sample Output:
Package: Paris, 7 Days, $1500


*/

class TravelPackage{
    private String destination;
    private int days;
    private double cost;

    public TravelPackage(String destination,int days,double cost){
        this.destination=destination;
        this.days=days;
        this.cost=cost;
    }

    public void display(){
        System.out.println("Package: "+destination+ "," +days+ " Days," +cost);
    }

    public void updatePackage(String destination,int days,double cost){
        this.destination=destination;
        this.days=days;
        this.cost=cost;
        System.out.println("Package updated successfully.");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Destination: ");
        String destination=sc.nextLine();

        System.out.print("Days: ");
        int days=sc.nextInt();

        System.out.print("Cost: ");
        double cost=sc.nextDouble();

        TravelPackage tpack=new TravelPackage(destination, days, cost);

        tpack.display();

        sc.nextLine();

        System.out.println("\n-----Updated Package-----");

        System.out.print("Destination: ");
        String newDest=sc.nextLine();

        System.out.print("Days: ");
        int newDays=sc.nextInt();

        System.out.print("Cost: ");
        double newCost=sc.nextDouble();

        tpack.updatePackage(newDest, newDays, newCost);
        tpack.display();
    }
}

/*

Create a Bill class with attributes item_name, quantity, and price_per_unit. 
Write a method to calculate the total bill amount.

Sample Input:
Item: Pen
Quantity: 10
Price per Unit: 2

Sample Output:
Total: $20

 */

class Bill{
    private String itemName;
    private int quantity;
    private int pricePerUnit;
    
    public Bill(String itemName,int quantity,int pricePerUnit){
        this.itemName=itemName;
        this.quantity=quantity;
        this.pricePerUnit=pricePerUnit;
    }

    public int totalBillAmount(){
        return quantity*pricePerUnit;
    }

    public void display(){
        System.out.println("Total: "+totalBillAmount());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Item: ");
        String item=sc.nextLine();

        System.out.print("Quantity: ");
        int quantity=sc.nextInt();

        System.out.print("Price Per Unit: ");
        int ppu=sc.nextInt();

        Bill newBill=new Bill(item,quantity,ppu);

        newBill.totalBillAmount();
        newBill.display();
    }
}

/*

Write a BankAccount class with attributes account_number, holder_name, and balance. 
Add methods to deposit and withdraw money.

Sample Input:
Account Number: 12345
Holder Name: John
Deposit: 1000

Sample Output:
Balance = 1000

*/


class BankAccount {
    private int accNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accNumber, String holderName) {
        this.accNumber = accNumber;
        this.holderName = holderName;
        this.balance = 0;  
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void depositAmount(double deposit) {
        if (deposit >=0) {
            balance += deposit;
            System.out.println(deposit + " deposited successfully.");
        } else {
            System.out.println("Deposit must be at least Rs.500.");
        }
    }

    public void withdrawAmount(double withdraw) {
        if (withdraw <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (balance - withdraw >= 500) {
            balance -= withdraw;
            System.out.println(withdraw + " withdrawn successfully");
        } else {
            System.out.println("Minimum balance should be Rs.500 ");
        }
    }

    public void display() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Current Balance: Rs." + balance);
    }
}

class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNumber = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Holder Name: ");
        String holderName = sc.nextLine();

        BankAccount account = new BankAccount(accNumber, holderName);

        System.out.print("Enter amount to deposit: ");
        double deposit = sc.nextDouble();
        account.depositAmount(deposit);

        System.out.print("Enter amount to withdraw: ");
        double withdraw = sc.nextDouble();
        account.withdrawAmount(withdraw);

        account.display();
    }
}



/*

Write a Rectangle class with attributes length and width. Add methods to calculate area and perimeter.
Create a Circle class with an attribute radius. Write methods to calculate area and circumference.


*/

class Area{

    public int findArea(int length,int breadth){
        return length*breadth;
    }

    public int findArea(int side){
        return side*side;
    }

    public double  findArea(double radius){
        return 3.14*radius*radius;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Area result=new Area();
        
        System.out.print("Enter the length: ");
        int length=sc.nextInt();

        System.out.print("Enter the breadth: ");
        int breadth=sc.nextInt();

        System.out.print("Enter the side: ");
        int side=sc.nextInt();

        System.out.print("Enter the radius: ");
        int radius=sc.nextInt();

        System.out.println(result.findArea(length, breadth));
        System.out.println(result.findArea(side));
        System.out.println(result.findArea(radius));
    }
}

// USING CONSTRUCTOR

class AreaExample{
    private int length;
    private int breadth;
    private int side;
    private double radius;

    public AreaExample(int length,int breadth,int side,double radius){
        this.length=length;
        this.breadth=breadth;
        this.side=side;
        this.radius=radius;
    }

    public int areaCal(int length,int breadth){
        return length*breadth;
    }

    public int areaCal(int side){
        return side*side;
    }

    public double areaCal(double radius){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Length: ");
        int length=sc.nextInt();

        System.out.print("Enter the breadth: ");
        int breadth=sc.nextInt();

        System.out.print("Enter the Side: ");
        int side=sc.nextInt();

        System.out.print("Enter the radius: ");
        double radius=sc.nextDouble();

        AreaExample arm=new AreaExample(length, breadth, side, radius);

        System.out.println("-------------------------");
        System.out.println("Area of Rectangle: "+arm.areaCal(length, breadth));
        System.out.println("Area of Square: "+arm.areaCal(side));
        System.out.println("Area of Circle: "+arm.areaCal(radius));
    }

}





