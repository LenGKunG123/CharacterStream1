package characterstream;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab3 {
    public static void main(String[] args){
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println(50.5);
            output.println(178);
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            FileReader file = new FileReader("data.txt");
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            System.out.println(name);
            int age = input.nextInt();
            System.out.println(age);
            double weight = input.nextDouble();
            System.out.println(weight);
            double height = input.nextDouble();
            System.out.println(height);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
