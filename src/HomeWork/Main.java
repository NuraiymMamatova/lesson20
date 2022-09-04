package HomeWork;

import java.io.IOException;
import java.rmi.server.ExportException;

public class Main {
    public static void main (String[]args) throws IOException {
        try {
             new Car().close();

        }finally {
            
             new Car().drive();
        }

    }
}
