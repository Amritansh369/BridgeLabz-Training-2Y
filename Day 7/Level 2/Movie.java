public class Movie {
    public static class MovieTicket{
        String movieName;
        int seatNumber;
        int price;
        public void book(int seatNumber,int price){
            this.seatNumber=seatNumber;
            this.price=price;
        }
        public void display(){
            System.out.println("seatnumber "+seatNumber);
            System.out.println("price "+price);
        }
    }
    public static void main(String[] args) {
        MovieTicket m1=new MovieTicket();
        m1.book(2,200);
        m1.display();
    }
}
