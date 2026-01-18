// In this problem reversing a list, we use three pointer approach and shift the pointers such that the next pointer of current node points to previous node.
// Time Complexity: O(n) where n is the number of nodes in the linked list.
// Space Complexity: O(1) as we are using constant space.

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prev : ListNode? = null
        var curr = head

        while(curr != null) {
            val temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        }

        return prev
    }
}