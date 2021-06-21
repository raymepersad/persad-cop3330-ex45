package ex45;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestWordFinder {
    // main method thet throws IOException

    public static void main(String[] args) throws IOException {

        // create a object of Scanner class

        Scanner s = new Scanner(System.in);

        // prompt the name of output file from user

        System.out.print("\nEnter the output file : ");

        String outputfile = s.next();

        // create a object of ReadFile class

        ReadFile rf = new ReadFile();

        // read file

        rf.readile();

        // get the list contains data of file

        ArrayList<String> list = rf.getdata();

        // create a object of WriteFile
//       and passing output file name and list contains data

        WriteFile wr = new WriteFile(outputfile, list);

        // write file

        wr.writefile();

        // and print the Number of Modifications on console

        System.out.println("\nThe Number of Modifications are : "+wr.getModification());


    }
}
