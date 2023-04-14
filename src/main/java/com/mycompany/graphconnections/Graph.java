/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphconnections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author skyla
 */
public class Graph {
    private Map<String, String> connections;

    // Constructor
    public Graph() {
        connections = new HashMap<>();
    }

    // Method to add connections between nodes
    public void addConnection(String[] connect) {
        for(String connection:connect){
            String from = connection.charAt(0) + "";
                        String to = connection.charAt(1) + "";

        if (!connections.containsKey(from)) {
            connections.put(from, to);
        }
        else{
                        connections.put(from, connections.get(from) + to);
        }
        if (!connections.containsKey(to)) {
            connections.put(to, from);
        }
        else{
                        connections.put(to, connections.get(to) + from);
        }
        }
         
    }

    // Method to check if a connection exists between two nodes
    public boolean check(String one, String two, String been) {
        if(one.equals(two)){
            return true;
        } else {
            String connectionsForOne = connections.get(one);
            for (int spot = 0; spot < connectionsForOne.length(); spot++) {
                if (!been.contains(connectionsForOne.charAt(spot) + "")) {
                    been+=connectionsForOne.charAt(spot) +"" ;
                    if (check(connectionsForOne.charAt(spot) +"", two, been)) {
                        return true; // recursive call to check for indirect connection
                    }
                }
            }
            return false;
        }

         

    }
    
    // Method to clear all connections in the graph
    public void clear() {
        connections.clear();
    }
}
