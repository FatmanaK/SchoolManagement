package school.tests;

import school.utilities.ExceptionUtils;

import java.io.IOException;

import static school.utilities.ExceptionUtils.*;

public class ExceptionTests {


    public static void main(String[] args) throws IOException { // declared throws keyword to take care of problem
       // ExceptionUtils.generateCustomException("1");

      //  ExceptionUtils.generateCustomExceptionWithMessage(20, 0);

      //  ExceptionUtils.generateNullPointerException();

      //  generateIOException();

      //  generateArrayOutOfBounds(4);

        generateInputMismatch();
    }
}

// Come back at 3:27