public class StudentMarks{
    public static class Student{
        String name;
        int rollNumber;
        int marks;
        public void grade(int marks){
            if(marks>=0 && marks<20){
                System.out.println("A");
            }
            else if(marks>=20 && marks<30){
                System.out.println("B");
            }
            else if(marks>=30 && marks<40){
                System.out.println("C");
            }
            else if(marks>=40 && marks<50){
                System.out.println("D");
            }
        }
        public void details(){
            System.out.println(name);
            System.out.println(rollNumber);
            System.out.println(marks);
        }
    }
    public static void main(String[] args) {
        Student d1=new Student();

    }
}