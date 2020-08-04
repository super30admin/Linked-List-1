//Time complexity=O(N)
//Space complexity=O(n), for recursive stack

//We are going till the end of the list and are changing the direction of the list
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
        if(head== null || head.next==null) return head;
        ListNode r=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return r;
    }
}


//Time complexity=O(n)
//Space complexity=O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode temp=null;
        ListNode curr=head;
        //Here we are taking a curr node that represents our current location, currtemp point to the next of curr node, also we have a temp node that is assigned to curr after changing the direction of curr and is used for pointing the next element to its previous one.  
        while(curr!=null)
        {
            ListNode currtemp=curr.next;
            curr.next=temp;
            temp=curr;
            curr=currtemp;
        }
          return temp;
    }
}