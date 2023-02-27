import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try(Scanner in = new Scanner(new File("numbers.txt"))) {
            System.out.println(in.nextInt());
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (Exception e){
            System.out.println("yeaaaa");
        } finally {
            System.out.println("finally");
        }
    }
}