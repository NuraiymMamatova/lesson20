package HomeWork;

import java.io.IOException;

public class Car  extends RuntimeException{
    void close() throws IOException {
        try {
            System.out.println("Машина жабылып жатат");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
     void drive() throws IOException{
        try {
            System.out.println("Машина журуп жатат");
        }catch (Exception e ){
            throw new IOException();
        }

    }

}
