package practice;

public class LearnLoop {
    public void WhileLoop() {
        int x = 1;
        while ( x <=100) {
            System.out.println("Value of x: " + x);
        }
    }

    public void forLoop() {
        for(int x = 1; x<= 100; x++) {
            System.out.println("Value of x: " +x);
        }
    }

    public void doWhileLoop() {
        int x = 1;
        do {
            System.out.println("Value of x: " + x);
            x++;
        } while (x <= 100);
    }
}

