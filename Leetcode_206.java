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
class Solution {
    public ListNode reverseList(ListNode head) {
        return helper(head,null);

        
    }

    private ListNode helper(ListNode curr,ListNode prev){
        if(curr==null){
            return prev;
        }

        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;

        return helper(curr,prev);

    }
}

//way3
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
 //Use three pointers
 //Store current.next in temp
 //Make curr.next as prev;
 //Move prev to curr
 //Move curr to temp[next current]
 //TC: O(n); SC:O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;

        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }

        return prev;
        
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
 //Using recurssion
 //TC: O(n); SC:O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
        return helper(head);

        
    }

    private ListNode helper(ListNode head){
       //
       if(head==null || head.next==null){
        return head;
       }


       //
       ListNode curr=helper(head.next);
       head.next.next=head;
       head.next=null;

       return curr;



    }
}
