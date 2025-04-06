package exercises;

public class exercise19 {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println("Tabuada do" + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
