// In this problem, we are removing the nth node by using 2 pointer approach. We have a slow and a fast pointer, both starting at a dummy node. 
// then we move the fast pointer ahead by n spaces. after that we move both pointers one step at a time until the fast pointer reaches the end of the list. 
// at this point, the slow pointer will be at the node just before the nth node. we then remove the nth node by adjusting the next pointer of the slow pointer to skip the nth node.
// Time Complexity: O(n) where n is the number of nodes in the linked list.
// Space Complexity: O(1) as we are using constant space.
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var dummy = ListNode(-1)
        dummy.next = head
        var slow = dummy
        var fast = dummy

        var count = 0
         while(count <= n){
            fast = fast.next;
            count++;
        }

        while (fast != null) {
            slow = slow.next
            fast = fast.next
        }

        var temp = slow.next
        slow.next = slow.next.next
        temp.next = null

        return dummy.next
    }
}