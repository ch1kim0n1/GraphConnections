/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphconnections;

/**
 *
 * @author skyla
 */
import java.util.HashSet;

public class GraphRunner {
    public static void main(String[] args) {
        // Create a new graph
        Graph graph = new Graph();

        // Case 1: Add connections
        String case1 = "NO PQ RS TU OU RP AB CD EF GH AH CE NS FA GQ";
        String[] list1 = case1.split(" ");
        graph.addConnection(list1);

        System.out.println("D connects to T == " + graph.check("D", "T", ""));
        
        graph.clear();
        
        case1 = "PQ QX AX BX CX DX EX FX GX AB BC CD DE AE CE FD TG";
        list1 = case1.split(" ");
        graph.addConnection(list1);

        System.out.println("P connects to T == " + graph.check("P", "T", ""));
        
        graph.clear();
        
        case1 = "AE EI IO OU BC CD DF FG";
        list1 = case1.split(" ");
        graph.addConnection(list1);

        System.out.println("A connects to G == " + graph.check("A", "G", ""));
        
        graph.clear();
        
        case1 = "HI HJ HK KL KM KN MO MP MQ";
        list1 = case1.split(" ");
        graph.addConnection(list1);

        System.out.println("H connects to Q == " + graph.check("H", "Q", ""));
        
        graph.clear();
        
        case1 = "AB CD EF GH CB ED GF HI";
        list1 = case1.split(" ");
        graph.addConnection(list1);

        System.out.println("A connects to I == " + graph.check("A", "I", ""));
        
        graph.clear();
        
        case1 = "TV XY AZ XT JK KL LT JX MN TN JL NO OP PT NX";
        list1 = case1.split(" ");
        graph.addConnection(list1);

        System.out.println("V connects to Z == " + graph.check("V", "Z", ""));
        
        graph.clear();
        
        case1 = "AB BC CD DE EF FG GH HI IJ JA AC FZ";
        list1 = case1.split(" ");
        graph.addConnection(list1);

        System.out.println("A connects to Z == " + graph.check("A", "Z", ""));
        
        graph.clear();
        
        case1 = "NO PQ RS TU OU RP AB CD EF GH AH CE NS FA GQ";
        list1 = case1.split(" ");
        graph.addConnection(list1);

        System.out.println("D connects to T == " + graph.check("D", "T", ""));
        
        graph.clear();
        
        case1 = "IX VX CX DX MX LX BY";
        list1 = case1.split(" ");
        graph.addConnection(list1);

        System.out.println("I connects to B == " + graph.check("I", "B", ""));
    }
}
