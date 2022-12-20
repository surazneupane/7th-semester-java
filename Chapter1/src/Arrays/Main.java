package Arrays;
public class Main {
    public static void main(String[] args) {
        Integer array[] = new Integer[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        for(int i=0;i<5;i++)
        {
            System.out.println(array[i]);
        }
        for (int i : array)
        {
            System.out.println(i);
        }
    }
}
