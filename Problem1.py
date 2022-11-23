#Time complexity: O(n)
#Space complexity: O(n) (recursive stack space)

#Accepted on Leetcode

#Approach:
#Recursively iterate to end of the list until last element found, return this as head of new list
#As recursion unwinds, make each elements next node point to the element, also set the current elements next pointer to None (useful for the very first element -> which becomes the last element in the reversed list)
#Return the head of the new list (which is the original last element that was passed down recursively)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head

        reverseListHead = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return reverseListHead


        