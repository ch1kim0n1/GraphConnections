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
import java.util.HashSet;

public class GraphRunner {
    public static void main(String[] args) {
        Graph graph = new Graph();
        
        // Add connections to the graph
        graph.addConnection("CA", "XY");
        graph.addConnection("XY", "RS");
        graph.addConnection("YS", "ST");
        graph.addConnection("ST", "TB");
        graph.addConnection("AX", "BD");
        graph.addConnection("RJ", "TB");
        graph.addConnection("CD", "PQ");
        graph.addConnection("QX", "AX");
        graph.addConnection("BX", "CX");
        graph.addConnection("DX", "EX");
        graph.addConnection("EX", "FX");
        graph.addConnection("FX", "GX");
        graph.addConnection("AB", "BC");
        graph.addConnection("CD", "DE");
        graph.addConnection("AE", "CE");
        graph.addConnection("FD", "TG");
        graph.addConnection("PQ", "NO");
        graph.addConnection("RS", "TU");
        graph.addConnection("OU", "RP");
        graph.addConnection("AB", "CD");
        graph.addConnection("EF", "GH");
        graph.addConnection("CB", "ED");
        graph.addConnection("GF", "HI");
        graph.addConnection("AI", "TV");
        graph.addConnection("XY", "AZ");
        graph.addConnection("XT", "JK");
        graph.addConnection("KL", "LT");
        graph.addConnection("JX", "MN");
        graph.addConnection("TN", "JL");
        graph.addConnection("NO", "OP");
        graph.addConnection("PT", "NX");
        graph.addConnection("VZ", "AB");
        graph.addConnection("BC", "CD");
        graph.addConnection("DE", "EF");
        graph.addConnection("FG", "GH");
        graph.addConnection("HI", "IJ");
        graph.addConnection("JA", "AC");
        graph.addConnection("FZ", "AZ");
        graph.addConnection("NO", "PQ");
        graph.addConnection("RS", "TU");
        graph.addConnection("OU", "RP");
        graph.addConnection("AB", "CD");
        graph.addConnection("EF", "GH");
        graph.addConnection("AH", "CE");
        graph.addConnection("NS", "FA");
        graph.addConnection("GQ", "DT");
        graph.addConnection("IX", "VX");
        graph.addConnection("CX", "DX");
        graph.addConnection("MX", "LX");
        graph.addConnection("BY", "IB");
        
        // Test the "check" method with sample data
        System.out.println(graph.check("C", "D", new HashSet<>())); // true
        System.out.println(graph.check("P", "T", new HashSet<>())); // true
        System.out.println(graph.check("A", "G", new HashSet<>())); // false
        System.out.println(graph.check("H", "Q", new HashSet<>())); // true
        System.out.println(graph.check("A", "I", new HashSet<>())); // true
        System.out.println(graph.check("V", "Z", new HashSet<>())); // false
        System.out.println(graph.check("A", "Z", new HashSet<>())); // true
        System.out.println(graph.check("D", "T", new HashSet<>())); // true
        System.out.println(graph.check("I", "B", new HashSet<>())); // false
    }
}
