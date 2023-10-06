//*************************************
//
//  WordLists.java
//
//  Class to aid with Wordle
//  Programming Project 5, COMS W1004
//
//
//  Your Name: Rhys Talley 
//  Your Uni: rt2860
//**************************************

import java.util.ArrayList;


public class WordLists{

    public static ArrayList<String> lengthN(ArrayList<String> words, int n){
        
       // your code here
       ArrayList<String> newArray = new ArrayList<String>();
       for(int i=0; i<words.size(); i++){
          if(words.get(i).length()==n){
             newArray.add(words.get(i));
          }
       }
       return newArray;
    }

    public static ArrayList<String> letterAt(ArrayList<String> words, 
      char included, int index){
         // your code here
         ArrayList<String> newArray = new ArrayList<String>();
         for(int i =0; i<words.size(); i++){
            if(words.get(i).charAt(index)==included){
               newArray.add(words.get(i));
            }
         }
         return newArray;
    }


    public static ArrayList<String> notAt(ArrayList<String> words,
      char included, int index){
         // your code here
         ArrayList<String> newArray = new ArrayList<String>();
         for(int i =0; i<words.size(); i++){
            if(words.get(i).contains(""+included) && words.get(i).charAt(index)!=included){
               newArray.add(words.get(i));
            }
         }
         return newArray;
    }

 
    public static ArrayList<String> notIn(ArrayList<String> words,
      char included){
          // your code here
          ArrayList<String> newArray = new ArrayList<String>();
         for(int i =0; i<words.size(); i++){
            if(!words.get(i).contains(""+included)){
               newArray.add(words.get(i));
            }
         }
         return newArray;
    }

} // end of class








