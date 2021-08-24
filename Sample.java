// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode front=head.next.next;
        ListNode cur=head.next;
        ListNode prev=head;
        if(head.next.next==null){
            cur.next=head;
            head.next=null;
            return cur;
        }
       
        head.next=null;
        
        while(front!=null){
            cur.next=prev;
            prev=cur;
            cur=front;
            front=front.next;
        }
        cur.next=prev;
        return cur;
       
        
        
        
        
    }
}






/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        int count=n;
        while(count!=1){
            cur=cur.next;
            count--;
        }
        ListNode main=head;
        ListNode prev=null;
        
        while(cur.next!=null){
            prev=main;
            main=main.next;
            cur=cur.next;
            
        }
        if(prev==null){
            head=head.next;
            return head;
        }
        prev.next=main.next;
        return head;
    }
}


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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean hascycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                hascycle=true;
                break;
            }
        }
        if(hascycle==false){
            return null;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
        
        
    }
}