# Time Complexity : O(N)
# Space Complexity : O{1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Create 2 pointers slow=head and fast= head
#Move the fast pointer forward by n nodes
#After that, until fast.next is valid, both slow and fast move to the next nodes
#Assign slow.next to slow.next.next which removes the connection to the Nth node from the end of the linked list

 def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        fast, slow = head, head
        for _ in range(n): fast = fast.next
        if not fast: return head.next
        while fast.next: fast, slow = fast.next, slow.next
        slow.next = slow.next.next
        return head