//In this prblem we are trying to detect a cycle. We have used two pointer approach where we have a slow and a fast pointer both starting at head. Then we find the cycle by moving slow pointer by 1 and fast pointer by 2
// if they meet at some point then there is a cycle. after that we reset one pointer to head and move both pointers by 1 until they meet again. the meeting point is the start of the cycle.
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
    fun detectCycle(head: ListNode?): ListNode? {
        if(head == null) return null

        var slow = head
        var fast = head
        var flag = false
        while(fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next.next

            if (slow == fast) {
            flag = true
            break
            }

        }  
        if(!flag){
            return null
        }

        slow = head
        while(slow != fast) {
            slow = slow?.next
            fast = fast?.next
        }

        return slow
    }
}