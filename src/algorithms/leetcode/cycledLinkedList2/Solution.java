package algorithms.leetcode.cycledLinkedList2;

import algorithms.firecode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> listNodes = new HashSet<>();

        ListNode node = head;
        while (node != null){
            if (listNodes.contains(node)){
                return node;
            }
            listNodes.add(node);
            node = node.next;
        }
        return null;
    }
}
