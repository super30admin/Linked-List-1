# Time: O(n)
# Space: O(1)

# keep track of the prev node
# have a temp variable to not loose the curr.next value
# then assign curr.next pointer to prev
# move prev to curr and curr to temp (temp has the curr.next i.e. the next element)
# return the prev node as curr will be sitting at null
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr = head
        prev = None

        while curr != None:
            temp = curr.next
            curr.next = prev
            prev =curr
            curr = temp
        return prev