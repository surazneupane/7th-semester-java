package Constructor;

public class Box {
     public Double length;
     public Double breadth;
     public Double height;

    public Box()
     {
        this.length = 10.0;
        this.breadth = 20.0;
        this.height = 30.0;
     }

     public Box(double length){
        this.length = length;
        this.breadth = length;
        this.height = length;
     }

     public Box(double length , double breadth , double height)
     {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
     }


     public void volume(){
         System.out.println("The Volume of box is "+ this.length * this.breadth * this.height);
     }





}
