class Book{
    String title;String author;double price;
    Book(){title="Unknown";author="Unknown";price=0.0;}
    Book(String title,String author,double price){this.title=title;this.author=author;this.price=price;}
}
class Circle{
    double radius;
    Circle(){this(1.0);}
    Circle(double radius){this.radius=radius;}
}
class Person{
    String name;int age;
    Person(String name,int age){this.name=name;this.age=age;}
    Person(Person p){this.name=p.name;this.age=p.age;}
}
class HotelBooking{
    String guestName;String roomType;int nights;
    HotelBooking(){guestName="Guest";roomType="Standard";nights=1;}
    HotelBooking(String guestName,String roomType,int nights){this.guestName=guestName;this.roomType=roomType;this.nights=nights;}
    HotelBooking(HotelBooking h){this.guestName=h.guestName;this.roomType=h.roomType;this.nights=h.nights;}
}
class LibraryBook{
    String title;String author;double price;boolean available;
    LibraryBook(String title,String author,double price){this.title=title;this.author=author;this.price=price;this.available=true;}
    void borrowBook(){if(available){available=false;System.out.println(title+" borrowed");}else System.out.println(title+" not available");}
}
class CarRental{
    String customerName;String carModel;int rentalDays;double costPerDay=1000;
    CarRental(String customerName,String carModel,int rentalDays){this.customerName=customerName;this.carModel=carModel;this.rentalDays=rentalDays;}
    double totalCost(){return rentalDays*costPerDay;}
}
