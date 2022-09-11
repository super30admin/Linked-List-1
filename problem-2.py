#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if head.next is None:
                return None
        ptr1 = head
        ptr2 = head
        i = 0
        #Iterate through the linked list till nth node
        for i in range (n):
            ptr1 = ptr1.next
        #if nth node is tail, change head to head.next and return head
        if ptr1 is None:
            head = head.next
            return head
        #now iterate the second pointer and 1st one till p1 reaches tail of the list
        while ptr1.next:
            ptr1 = ptr1.next
            ptr2 = ptr2.next
        #Now remove the list
        ptr2.next = ptr2.next.next
        return head