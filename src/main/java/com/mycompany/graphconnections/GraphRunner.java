/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphconnections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author skyla
 */
class GraphRunner {
    String list = "";
    
    
    public void main(String[] args) {
        Graph gr = new Graph();
        Scanner scn = new Scanner(System.in);
        System.out.println("Give me your sequence:"); 
        String str = scn.nextLine();
        System.out.println("What letters to find?");
        String str2 = scn.nextLine();
        //we know for sure that there are only 2 letters in that string
        char Strart = str2.charAt(0);
        char Finish = str2.charAt(1);
        
        //covnert the string into array lsit that use has provided
        // split string by no space
        String[] strSplit = str.split(" ");
  
        // Now convert string into ArrayList
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strSplit));
        
        //use method from graph to check and return boolean
        boolean answ = gr.CheckList(Strart, Finish, strList);
        
        pritout(Strart, Finish, answ);
    }
    
    
    public void pritout(char sta, char fin, boolean answ){
        System.out.println (sta + "connects to " + fin + " == " + answ);
    } 
}
