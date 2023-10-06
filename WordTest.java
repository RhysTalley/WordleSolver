//
//  WordTest.java
//
//  Class to test WordLists
//  Programming Project 5, COMS W1004
//
//
//  Your Name: Rhys Talley
//  Your Uni: rt2860
//**************************************

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class WordTest{

    public static void main(String[] args) throws FileNotFoundException {
        // your code here
        ArrayList<String> master = new ArrayList<String>();
        try{
            File inFile = new File("wordlist.txt");
            Scanner input = new Scanner(inFile);
            while(input.hasNextLine()) {
                master.add(input.nextLine());
            }
            ArrayList<String> myList=WordLists.lengthN(master,4);
            myList=WordLists.letterAt(myList,'j',0);
            myList=WordLists.notAt(myList,'v',1);
            myList=WordLists.notIn(myList,'e');
            myList=WordLists.notIn(myList,'i');
            PrintWriter output = new PrintWriter("out.txt");
            for(int i=0; i<myList.size(); i++){
                output.println(myList.get(i));
            }
            output.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Enter a valid file name!");
        }
}

}