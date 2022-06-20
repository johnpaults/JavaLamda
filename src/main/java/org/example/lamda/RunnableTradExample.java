package org.example.lamda;

public class RunnableTradExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i < 10; i++)
                    sum = sum + i;
                System.out.println("Sum is " + sum);
            }
        };
        new Thread(runnable).start();

        //Lamda example

        Runnable lamdaRunnable = () -> {
            int sum = 0;
            for (int i = 1; i < 10; i++)
                sum = sum + i;
            System.out.println("Lamda Sum is " + sum);
        };

        new Thread(lamdaRunnable).start();
    }
}