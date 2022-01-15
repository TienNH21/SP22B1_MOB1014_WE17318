package buoi5;

public class DemoWhile {
    public static void main(String[] args) {
        // VD: In ra các số từ 1 -> 30
        // 1. In ra các số từ 1 -> 50
        // 2. In ra các số chẵn từ 1 -> 50
        
        int i = 1;
        
        while ( i <= 50 ) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        }
        
        // 3. In ra các số từ 50 -> 30
        int i1 = 50;
        while ( i1 >= 30 ) {
            System.out.println(i1);
            i1--;
        }
    }
}
