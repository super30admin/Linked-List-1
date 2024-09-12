// Time Complexity: O(n)
// Space complexity: O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Brute force(Two pass solution) is iterate through the list and get to know the length of the list
// then take (length - n) and once you reach (length-n)th element link it's next with it's next's next

// One pass solution is take two pointers slow and fast which first points 
// to a dummy node whose next is the head. Move the fast pointer until it 
// moves <=n times, and then start moving the slow pointer as well as the fast. 
// Once the fast pointer is null, link the slow pointers next with slow.next.next.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode fast = dummyNode;
        ListNode slow = dummyNode;
        
        int count = 0;
        
        while(fast.next != null){
            fast = fast.next;
            count++;    
            
            if(count > n){
                slow = slow.next;
            }
        }
        
        slow.next = slow.next.next;
        
        return dummyNode.next;
    }
}
