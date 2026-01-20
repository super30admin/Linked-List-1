//way1
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

 //Identify length
 //Find diff between lenght and n
 //Travel till the diff and remove next node
 //TC: O(n)+O(n)
 //SC: O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode curr=head;

        while(curr!=null){
            curr=curr.next;
            count+=1;
        }

        

        int diff=count-n;

        if(diff==0){
            return head.next;
        }

        int i=0;

        curr=new ListNode(-1);
        curr.next=head;

        while(i<diff){
            curr=curr.next;
            i+=1;
        }

        if(curr!=null && curr.next!=null){
            
            curr.next=curr.next.next;
        }
        

        return head;
        
    }
}

//way2
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

 //Using fast pointer travel till n nodes
 //Using slow pointer start from dummy node. Travel till fast!=null
 //TC: O(n)
 //SC: O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        ListNode slow=dummy;
        ListNode fast=dummy;

        while(n!=0){
            fast=fast.next;
            n--;
        }

        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;

        return dummy.next;
        
    }
}
