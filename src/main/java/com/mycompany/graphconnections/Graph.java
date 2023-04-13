/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphconnections;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author skyla
 */
public class Graph {
    private Map<String, Set<String>> connections;

    // Constructor
    public Graph() {
        connections = new HashMap<>();
    }

    // Method to add connections between nodes
    public void addConnection(String from, String to) {
        if (!connections.containsKey(from)) {
            connections.put(from, new HashSet<>());
        }
        if (!connections.containsKey(to)) {
            connections.put(to, new HashSet<>());
        }
        connections.get(from).add(to);
        connections.get(to).add(from); // connections are bi-directional
    }

    // Method to check if a connection exists between two nodes
    public boolean check(String one, String two, Set<String> been) {
        if (connections.containsKey(one) && connections.get(one).contains(two)) {
            return true; // direct connection exists
        } else {
            Set<String> connectionsForOne = connections.get(one);
            for (String spot : connectionsForOne) {
                if (!been.contains(spot)) {
                    been.add(spot);
                    if (check(spot, two, been)) {
                        return true; // recursive call to check for indirect connection
                    }
                }
            }
            return false; // no connection found
        }
    }
    
    // Method to clear all connections in the graph
    public void clear() {
        connections.clear();
    }
}
