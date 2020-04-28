package com.null7ptr.lc.explore.challenge30days.first_unique_number;

import java.util.HashMap;
import java.util.Map;

public class SolutionApproachDLinkedList {
    private Map<Integer, DLinkedNode> visited = new HashMap<Integer, DLinkedNode>();
    private DLinkedNode dummyHead, cur;

    public SolutionApproachDLinkedList(int[] nums) {
        dummyHead = new DLinkedNode(-1);
        cur = dummyHead;
        
        for(int num : nums){
            addNode(num);
        }
    }
    
    public int showFirstUnique() {
        if(dummyHead.next == null) return -1;
        return dummyHead.next.val;
    }
    
    public void add(int value) {
        addNode(value);
    }
    
    private void addNode(int value){
        if(!visited.containsKey(value)){
            DLinkedNode node = new DLinkedNode(value);
            visited.put(value, node);
            cur.next = node;
            node.prev = cur;
            cur = cur.next;
        }else{
            DLinkedNode node = visited.get(value);
            if(node != null){
                removeNode(node);
                visited.put(value, null);
            }
        }
    }
    
    private void removeNode(DLinkedNode node){
        if(node.next == null){
            node.prev.next = null;
        }else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }
    
    class DLinkedNode{
        int val;
        DLinkedNode prev;
        DLinkedNode next;
        
        DLinkedNode(int val){
            this.val = val;
            prev = null;
            next = null;
        }
    }
}