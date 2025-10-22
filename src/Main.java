import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test case 1 (findFreeBlock)");
        boolean[][] test1$schedule = new boolean[8][60];
        AppointmentBook test1$book = new AppointmentBook(test1$schedule);
        for (int i = 10; i <= 14; i ++) {
            test1$schedule[1][i] = true;
        }
        for (int i = 30; i <= 44; i ++) {
            test1$schedule[1][i] = true;
        }
        for (int i = 50; i <= 59; i ++) {
            test1$schedule[1][i] = true;
        }
        System.out.println("Printing period 2");
        test1$book.printPeriod(2);
        System.out.println("book.findFreeBlock(2, 15): " + test1$book.findFreeBlock(2, 15));
        System.out.println("book.findFreeBlock(2, 9): " + test1$book.findFreeBlock(2, 9));
        System.out.println("book.findFreeBlock(2, 20): " + test1$book.findFreeBlock(2, 20));

        System.out.println("Test case 2 (makeAppointment)");
        boolean[][] test2$schedule = new boolean[8][60];
        AppointmentBook test2$book = new AppointmentBook(test2$schedule);
        for (int i = 25; i <= 29; i ++) {
            test2$schedule[1][i] = true;
        }
        for (int i = 0; i <= 14; i ++) {
            test2$schedule[2][i] = true;
        }
        for (int i = 41; i <= 59; i ++) {
            test2$schedule[2][i] = true;
        }
        for (int i = 5; i <= 29; i ++) {
            test2$schedule[3][i] = true;
        }
        for (int i = 44; i <= 59; i ++) {
            test2$schedule[3][i] = true;
        }
        System.out.println("Printing period 2");
        test2$book.printPeriod(2);
        System.out.println("Printing period 3");
        test2$book.printPeriod(3);
        System.out.println("Printing period 4");
        test2$book.printPeriod(4);
        System.out.println("book.makeAppointment(2, 4, 22): " + test2$book.makeAppointment(2, 4, 22));
        System.out.println("book.makeAppointment(3, 4, 3): " + test2$book.makeAppointment(3, 4, 3));
        System.out.println("book.makeAppointment(2, 4, 30): " + test2$book.makeAppointment(2, 4, 30));
        System.out.println("Printing period 2");
        test2$book.printPeriod(2);
        System.out.println("Printing period 3");
        test2$book.printPeriod(3);
        System.out.println("Printing period 4");
        test2$book.printPeriod(4);

        int fulfilled = read();
    }

    public static int read() throws FileNotFoundException {
        int fulfilled = 0;

        File schedulesFile = new File("Schedules.txt");
        Scanner schedulesScanner = new Scanner(schedulesFile);
        while (schedulesScanner.hasNextLine()) {

        }
    }
}