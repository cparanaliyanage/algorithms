package com.charith.hackerrank.LinkedLists.ReverseADoublyLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverse() {
        Solution.DoublyLinkedList linkedList = new Solution.DoublyLinkedList();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        assertEquals("1 2 3 4", printDoublyLinkedList(linkedList.head));
        Solution.DoublyLinkedListNode head = Solution.reverse(linkedList.head);
        assertEquals("4 3 2 1", printDoublyLinkedList(head));
    }

     String printDoublyLinkedList(Solution.DoublyLinkedListNode node){
        StringBuilder printString = new StringBuilder();
        while (node != null) {
            printString.append(String.valueOf(node.data));
            node = node.next;
            if (node != null) {
                printString.append(" ");
            }
        }
        return printString.toString();
    }

}