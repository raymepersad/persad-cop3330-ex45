package ex45;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    // instance variable

    private ArrayList<String> list;
    private Scanner sc;

    // constructor

    public ReadFile() throws FileNotFoundException {

        list = new ArrayList<String>();

        // initialize instance variable

        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\Ankit\\Desktop\\exercise45_input.txt");
        sc = new Scanner(file);

    }

    public void readile() {

        // use try and finally to avoid exceptions

        try
        {
            int i=0;

            while( sc.hasNext() )
            {

                // read file line by line and store it into list

                String filedata = sc.nextLine();

                list.add(filedata);


            }
        }
        finally
        {
            sc.close();
        }

    }

    //return the list

    public ArrayList<String> getdata() {

        return list;

    }
}
