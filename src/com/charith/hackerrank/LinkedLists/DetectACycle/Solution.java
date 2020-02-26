package com.charith.hackerrank.LinkedLists.DetectACycle;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    boolean hasCycle(Node head){
        if(head == null){
            return false;
        }
        Set<Integer> visited = new HashSet<>();
        while (head.next !=null){
            if(!visited.add(head.data)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

class Node{
    int data;
    Node next;
}