//Time Complexity : O(N)
//Space Complexity : O(N)
//Recursive Solution 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //recursive solution
    public ListNode reverseList(ListNode head) {
        //base condition
        if(head== null || head.next ==null){
            return head;
        }
        //recursive call
        ListNode p =reverseList(head.next);
        //two tricker steps
        head.next.next=head;
        head.next=null;
        return p ;

    }
}