# Remove Nth Node From End of List

# Time complexity -> O(2n) -> O(n)
# Space complexity -> O1
# Logic -> iterate once find the length, in 2nd iteration stop at the desired position drop the node

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        length = 0

        curr  = head
        while curr!=None:
            length+=1
            curr=curr.next
        dummyNode = ListNode(-1,head)
        curr=dummyNode
        while length > n:
            length-=1
            curr=curr.next
        print(curr)
        curr.next=curr.next.next

        return dummyNode.next