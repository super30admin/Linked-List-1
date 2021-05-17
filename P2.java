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

//time-o(n)
//space-o(1)
//passed in leetcode- yes

//brute force- needs extra space, add all elements to array, go from last and remove node, then traverse from last and keep adding to new LL
//use- 2 pointers- fast and slow

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode walker = dummy;
        ListNode runner = dummy;
        int count=0;
        
        while(count!=n)//to keep a gap of n, between walker and runner, move runner
        {
            runner=runner.next;
            count++;
        }
        while(runner.next!=null)//move both ptrs untill runner reached end 
        {
            walker = walker.next;
            runner = runner.next;
        }
        walker.next=walker.next.next;//change references to delete node
        
        return dummy.next;
    }
}