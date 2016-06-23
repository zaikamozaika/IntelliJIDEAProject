package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException{

        TestSerial testSerial = new TestSerial();
        System.out.println(testSerial.name);

        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(testSerial);
        oos.flush();
        oos.close();
//        System.out.println();
//

        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TestSerial ts = (TestSerial)ois.readObject();
        System.out.println(ts.getVersion());


    }
}
