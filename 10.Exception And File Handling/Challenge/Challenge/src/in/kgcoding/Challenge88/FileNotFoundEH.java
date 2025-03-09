package in.kgcoding.Challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundEH {
    public static void main(String[] args) {
        System.out.println("File not found exception handling");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Filename: ");
        String fileName = scanner.next() ;

        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
            while((read = reader.read()) != -1){
                 System.out.print((char) read);
            }
        } catch(FileNotFoundException e){
            System.out.printf("%s not Found", fileName);
        }catch(IOException e){
            System.out.printf("Exception Occurred %s", e.getMessage());
        }
    }
}
