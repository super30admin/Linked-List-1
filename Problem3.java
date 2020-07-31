// There are two approaches.
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

import java.util.HashSet;
// Your code here along with comments explaining your approach
// Approach 1: Using HashSet 
// 1. By making HashSet of nodes.
// 2. Add next nodes into HashSet
// 3. if already present then we have cycle
// Time Complexity : O(n)
//      n: number of elements
// Space Complexity : O(n)
//      n: number of elements
//      for HashSet
//NOTE: We need HashMap for index of the node but not according to current inputs.
class Problem3S1 {

    //Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /** detect cycle and return the index for cycle */
    public ListNode detectCycle(ListNode head) {
        // hash set
        HashSet<ListNode> mySet = new HashSet<>();
        // for traversing
        ListNode current = head;
        while(current!=null){
            // not contains
            if(!mySet.contains(current))
                mySet.add(current);
            // contains
            else
                break;
            current = current.next;
        }
        // if there is no cycle current will be null;
        return current;
    }
}

// Approach 2: Using two pointer
// 1. By having two pointers one fast(2x) and slow(1x)
// 2. When they both meet we know there is cycle.
// 3. To find the start of cycle start slow from head.
// 4. And run both slow fast pointer by 1x.
// Time Complexity : O(n)
//      n: number of elements
// Space Complexity : O(1)
//      not using extra space

class Problem3S2 {

    //Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /** detect cycle and return the index for cycle */
    public ListNode detectCycle(ListNode head) {
        
        // pointer
        ListNode slow = head;
        ListNode fast = head;
        
        boolean flag = false;
        
        // iterate
        while(fast!=null && fast.next!=null ){
            // 1x
            slow = slow.next;
            // 2x
            fast = fast.next.next;
            if(fast==slow){
                flag = true;
                break;
                
            }
                
        }
        // cycle present
        if(flag){
            // both on 1x
            slow = head;
            // when it meets
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        // no cycle
        return null;
    }
}