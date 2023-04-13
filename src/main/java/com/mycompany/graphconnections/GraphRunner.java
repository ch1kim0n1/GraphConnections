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
        graph.addConnection("CA", "XY");
        graph.addConnection("RS", "YS");
        graph.addConnection("ST", "TB");
        graph.addConnection("AX", "BD");
        graph.addConnection("RJ", "BD");
        System.out.println("Case 1: ");
        System.out.println("Connection between CD exists: " + graph.check("CD", "CD", new HashSet<>()));

        // Case 2: Add connections
        graph.clear(); // Clear all connections in the graph
        graph.addConnection("PQ", "QX");
        graph.addConnection("AX", "BX");
        graph.addConnection("CX", "DX");
        graph.addConnection("EX", "FX");
        graph.addConnection("GX", "AB");
        graph.addConnection("BC", "CD");
        graph.addConnection("DE", "AE");
        graph.addConnection("CE", "FD");
        graph.addConnection("TG", "FD");
        System.out.println("Case 2: ");
        System.out.println("Connection between PT exists: " + graph.check("PT", "PT", new HashSet<>()));

        // Case 3: Add connections
        graph.clear(); // Clear all connections in the graph
        graph.addConnection("AE", "EI");
        graph.addConnection("IO", "OU");
        graph.addConnection("BC", "CD");
        graph.addConnection("DF", "FG");
        System.out.println("Case 3: ");
        System.out.println("Connection between AG exists: " + graph.check("AG", "AG", new HashSet<>()));

        // Case 4: Add connections
        graph.clear(); // Clear all connections in the graph
        graph.addConnection("HI", "HJ");
        graph.addConnection("HJ", "HK");
        graph.addConnection("KL", "KM");
        graph.addConnection("KN", "MO");
        graph.addConnection("MP", "MQ");
        System.out.println("Case 4: ");
        System.out.println("Connection between HQ exists: " + graph.check("HQ", "HQ", new HashSet<>()));

        // Case 5: Add connections
        graph.clear(); // Clear all connections in the graph
        graph.addConnection("AB", "CD");
        graph.addConnection("EF", "GH");
        graph.addConnection("CB", "ED");
        graph.addConnection("GF", "HI");
        System.out.println("Case 5: ");
        System.out.println("Connection between AI exists: " + graph.check("AI", "AI", new HashSet<>()));
        
        // Case 6: Add connections
        graph.clear(); // Clear all connections in the graph
        graph.addConnection("TV", "XY");
        graph.addConnection("AZ", "XT");
        graph.addConnection("JK", "KL");
        graph.addConnection("LT", "JX");
        graph.addConnection("MN", "TN");
        graph.addConnection("JL", "NO");
        graph.addConnection("OP", "PT");
        graph.addConnection("NX", "TN");
        System.out.println("Case 6: ");
        System.out.println("Connection between VZ exists: " + graph.check("VZ", "VZ", new HashSet<>()));

        // Case 7: Add connections
        graph.clear(); // Clear all connections in the graph
        graph.addConnection("AB", "BC");
        graph.addConnection("CD", "DE");
        graph.addConnection("EF", "FG");
        graph.addConnection("GH", "HI");
        graph.addConnection("IJ", "JA");
        graph.addConnection("AC", "FZ");
        System.out.println("Case 7: ");
        System.out.println("Connection between AZ exists: " + graph.check("AZ", "AZ", new HashSet<>()));

        // Case 8: Add connections
        graph.clear(); // Clear all connections in the graph
        graph.addConnection("NO", "PQ");
        graph.addConnection("RS", "TU");
        graph.addConnection("OU", "RP");
        graph.addConnection("AB", "CD");
        graph.addConnection("EF", "GH");
        graph.addConnection("AH", "CE");
        graph.addConnection("NS", "FA");
        graph.addConnection("GQ", "DT");
        System.out.println("Case 8: ");
        System.out.println("Connection between DT exists: " + graph.check("DT", "DT", new HashSet<>()));

        // Case 9: Add connections
        graph.clear(); // Clear all connections in the graph
        graph.addConnection("IX", "VX");
        graph.addConnection("CX", "DX");
        graph.addConnection("MX", "LX");
        graph.addConnection("BY", "IB");
        System.out.println("Case 9: ");
        System.out.println("Connection between IB exists: " + graph.check("IB", "IB", new HashSet<>()));
    }
}
