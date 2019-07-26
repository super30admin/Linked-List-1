//Approach: Two pointer apporoach with a slow and fast pointer, 
//find the intersection between slow and fast, Iterate over the list to find the slow "pos" from head - Refer leetcode
//Time Complexity:O(n2)
//Space Complexity:O(1)
//Run on Leetcode? Yes

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
        if(head==null) return null;
        ListNode intersect = getIntersect(head);
        if(intersect == null)
            return null;
        else{
            ListNode ptr1 =head;
            ListNode ptr2=intersect;
            while(ptr1!=ptr2){
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            return ptr1;
        }
    }
    
    public ListNode getIntersect(ListNode head){
        ListNode s=head; ListNode f = head;
        while(f!=null && f.next!=null){
            s = s.next;
            f= f.next.next;
            if(s==f)
                return s;
        }
        return null;
    }
}
