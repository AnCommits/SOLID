import io.*;
import model.Model;
import model.Module;
import service.IService;
import service.ServiceSum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("resources/numbers.txt");
//        Scanner scanner = new Scanner(file);
        Scanner scanner = new Scanner(System.in);
        IReader reader = new ReaderConsole(scanner);
//        IPrinter printer = new PrinterConsole();
        IPrinter printer = new PrinterStars();
        IData data = new Data(reader, printer);
        IService service = new ServiceSum();
        Module module = new Module(reader, printer, service);
        module.execute();
    }
}
