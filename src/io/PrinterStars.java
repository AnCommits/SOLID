package io;

//public class PrinterStars extends PrinterConsole {
public class PrinterStars implements IPrinter {

    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void print(int number) {
        System.out.println("*".repeat(number));
    }
}
