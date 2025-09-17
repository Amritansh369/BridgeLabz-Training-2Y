public class circle {
    public static class circleAreaAndCircumference{
        double radius;
        public void areaAndCircumference(){
            System.out.println("Circumference is "+2*Math.PI*radius);
            System.out.print("Area is "+Math.PI*radius*radius);
        }
    }
    public static void main(String[] args) {
        circleAreaAndCircumference c1=new circleAreaAndCircumference();
        c1.radius=27.5;
        c1.areaAndCircumference();
    }
}
