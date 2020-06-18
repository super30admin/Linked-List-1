import java.util.HashSet;
/*
    HashMap Solution

    Time complexity : O(N)
    Space Complexity : O(N)
    is worked on leetcode : YES

*/
public class LinkedListCycle_II {
    public ListNode has_cycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        boolean found = false;
        // iniitlize slow and fast pointer for  floyd's algorithm maintain found boolean variable
        // for handling cycle 
        while(fast!= null && fast.next != null){
            // move slow by one poiner and 
            // fast by two pointer until fast and slow meets 
            //  that means we find cycle
            
            slow =  slow.next;
            fast =  fast.next.next;
            if(fast == slow){
//                 cycle found
                found = true;
                break;
            } 
        }
        
        if(! found) return null; // no cycle
        // set slow pointer to head and now move fast and slow pointer by 1 
        // and if both reaches it is starting
        // point of cycle
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast= fast.next;
        }
        return slow;
    }
    public boolean hasCycle_using_hashMap(ListNode head) {
        
        HashSet<ListNode> set  =  new HashSet<ListNode>();
        
        while(head != null){
            if(set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}