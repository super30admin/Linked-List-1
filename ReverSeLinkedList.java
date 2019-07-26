//Approach: Need tp keep track of previous pointer, current pointer and a temp pointer to rememeber next curr position - temp:cur.next
//Time Complexity:O(n)
//Space Complexity : O(1)
//Run on Leetcode? Yes

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
        if(head==null || head.next==null)
            return head;
        else{
            ListNode prev = null;
            ListNode cur = head;
            while(cur!=null){
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
            return prev;
        }
    }
}
