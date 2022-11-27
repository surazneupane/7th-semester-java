package StaticAndFinal;

public final class FinalKeyword {
    final Double pi = 3.14;

    public void areaOfCircle(Double radius)
    {
//        we cant modify final variables
//        this.pi =10.0;
        System.out.println(
                "The area of circle:"+ this.pi * java.lang.Math.pow(radius,2)
        );
    }

    public static void main(String[] args) {
        FinalKeyword finalKeyword = new FinalKeyword();
        finalKeyword.areaOfCircle(2.0);
    }


}
