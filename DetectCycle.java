/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class DetectCycle {
    //Time:O(n)
    //space:O(1)
    //did it run successfully on leetcode: yes
    public ListNode detectCycle(ListNode head) {
    
        if(head == null) return head;
        
        //initializing slow and fast pointer
        ListNode slow = head, fast = head;
        
        //flag to monitor cycle
        boolean cycle = false;
        
        //untill null is not found
        while(fast.next!=null && fast.next.next!=null){
            //update slow and fast pointers
            slow = slow.next;
            fast = fast.next.next;
            
            //slow and fast meetrs
            if(slow == fast){
                //cycle exists
                cycle = true;
                break;
            } 
        }
        
        //no cycle
        if(!cycle) return null;
        
        //if cycle exists
        //start a new slow pointer from head
        ListNode slow2 = head;
        
        //until slow2 and slow meets
        while(slow2!=slow){
            
            //update slow and slow2
            slow2 = slow2.next;
            slow = slow.next;
        }
        
        
        return slow;
        
    }
    
}