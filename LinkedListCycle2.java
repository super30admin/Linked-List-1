// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

// Use Slow and fast pointers
// Move slow by 1 step and fast by 2 steps.
// If slow meets fast, a cycle is detected.
// To find the starting node of the cycle:
// Reset one of the pointers to the head of the list.
// Then move both slow and fast one step at a time.
// The point where they meet is the start of the cycle.




class ListNode {
    int val;
    ListNode next;
    ListNode (int x){
        val = x;
        next = null;
    }
}

public class LinkedListCycle2 {
    public ListNode solve(ListNode head){
        if(head==null){
            return null;
        }
        boolean hasCycle = false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            if(slow==fast){
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle){
            return null;
        }
        fast=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;

    }
    public static void main(String[]args){
        LinkedListCycle2 ob = new LinkedListCycle2();
        
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeNeg4 = new ListNode(-4);

        head.next = node2;
        node2.next = node0;
        node0.next = nodeNeg4;
        nodeNeg4.next = node2;

        ListNode cycleStart = ob.solve(head);
        if(cycleStart != null){
            System.out.println("Cycle detected at "+cycleStart.val);
        }
        else{
            System.out.println("No Cycle detected");
        }

    }




    
}
