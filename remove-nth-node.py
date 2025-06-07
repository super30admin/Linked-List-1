''' 
Problem: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

Time Complexity: O(n)
Space Complexity: O(1) 

Approach:
We can find the length of the linked list first, then calculate the position of the node to be removed from the start. 
Then we can traverse the linked list from the start and remove the node.

'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        L = 0
        temp = head
        while temp is not None:
            L += 1
            temp = temp.next

        L = L - n - 1 
        # edge case handling when we gotta delete the head and our pointer technically goes to prior head position
        if L < 0:
            head = head.next
        else:
            temp = head
            while L > 0:
                temp = temp.next
                L -= 1

            # temp.next is the node to delete
            if temp and temp.next:
                temp.next = temp.next.next

        return head
