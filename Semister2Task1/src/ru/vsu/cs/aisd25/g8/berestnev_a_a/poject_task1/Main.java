package ru.vsu.cs.aisd25.g8.berestnev_a_a.poject_task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("\r%d", i);
        }
    }
}