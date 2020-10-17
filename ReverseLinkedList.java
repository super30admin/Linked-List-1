/**
 * The time complexity is O(N) and the space complexity is O(N) since it stores all the elements in the stack before reversing.
 *
 * The solution uses the system stack to store and while popping the current element's next element is taken as previous.
 * Yes, the solution passed all the test cases in leet code.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){return null;}
        return reverse(head,null,head);
    }

    public ListNode reverse(ListNode curr,ListNode prev,ListNode head){
        if(curr.next==null){
            head = curr;
            curr.next = prev;
            return head;
        }
        else{
            head = reverse(curr.next,curr,head);
            curr.next=prev;
            return head;
        }
    }
}