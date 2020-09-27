package school.utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class ExceptionUtils {
    /*
            Exception is what is broken in the code:
            Compile time, Run Time Exception
            Checked vs Unchecked exceptions

            How we take care of exceptions?
            Handle(try) or declare(method signature: throws)
            - Send user to another service, while getting http error to fix it later
            - Display a simple message why this exception occurred.

            Declare with throws keyword

     */

    // use throw key to add some exceptions
    public static void generateCustomException(String num) throws IOException {

        Scanner scanner = new Scanner(num);

        if(scanner.next().equals("1"))
        {
            throw new IOException(); // declared throws to take care of exception
        }
        else
        {
            throw new NullPointerException();
        }

        //num = new Random().nextInt(10);
    }


    public static void generateCustomExceptionWithMessage(int num1, int num2){
        try {
            int result = num1/ num2;
        }catch (ArithmeticException e){
            System.out.println(num1 + " " + num2 + " are not divisible");
        }catch (NullPointerException e){
            System.out.println(num1 + " " + num2 + " may be null references!");
        }catch (Exception e){
            System.out.println("Caught the exception");
        }

    }

    public static void generateNullPointerException(){
        Object obj = null;

       try{
           System.out.println(obj.toString());
       }catch (NullPointerException np){
           System.out.println(np.getMessage());
       }
    }
    // // Handle with try resources - jdk 7 : BufferedReader
    public static void generateIOException(){
        // D:/JavaTest/files.txt  Input the file
        try(BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter("D:/JavaTest/files.txt")))
        {
            bufferedWriter.write(90); // output: Z
        } // catch IO exception
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void generateArrayOutOfBounds(int index){
            //idx        0     1    2    3
        int [] myArr = { 100, 200, 300, 400};

        try{
            if(myArr[index] == 500){
                System.out.println("Outofbounds");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index " + index
                             +" is out of bounds!\n" + e.getMessage());
          //  e.printStackTrace();
        }

    }

    public static void generateInputMismatch(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a char: ");
        try{
            int number = scanner.nextInt();
            System.out.println(number);
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
          //  e.printStackTrace();
        }

    }

}
