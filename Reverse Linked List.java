// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
     
        if(head==null || head.next ==null){return head;}
        
        ListNode curr= reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return curr;
    }
}


//ITERATIVE SOLUTION
    //     if(head ==null || head.next ==null){return head;}
    //  ListNode prev=null;
    //  ListNode curr=head;
    //      ListNode next=curr.next;
    //     while(next!=null){
    //         next=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr= next;            
    //     }
    //     return prev;
    // }

//SOLUTION 2
 // public ListNode reverseList(ListNode head) {
 //    ListNode prev = null;
 //    ListNode curr = head;
 //    while (curr != null) {
 //        ListNode nextTemp = curr.next;
 //        curr.next = prev;
 //        prev = curr;
 //        curr = nextTemp;
 //    }
 //    return prev;
 //    }