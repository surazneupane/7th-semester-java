package EnumClass;
public class Main {
    public static void main(String[] args) {
        Level myLevel = Level.MEDIUM;
        switch(myLevel){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
