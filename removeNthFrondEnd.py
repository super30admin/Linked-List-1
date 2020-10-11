
"""
Time Complexity: O(N)
Space Complexity: O(1)
"""
def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
    dummyLL = ListNode(0,head)

    fast, slow = dummyLL, dummyLL

    #moves pointer near the removing element
    while n:
        fast = fast.next
        n+=1

    #reaching just before end of linkedlist
    while fast and fast.next:
        fast = fast.next
        slow = slow.next
    slow.next = slow.next.next  #remove the element by updating pointer

    return dummyLL.next #.next to remove leading null