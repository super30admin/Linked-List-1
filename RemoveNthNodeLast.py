"""Remove Nth Node From End of List
Time Complexity - 0(n) n -> numbe rof nodes in Linkedlist
Space Complexity - O(1)
Approach - initialize 2 pointers. Move the fast pointer first till the difference between 2 pointers is equal to n and then move both the pointers in 1 x speed. Remove the slow.next when fast reaches the last node"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        count =1
        slow = fast = head
        
        while fast.next:
            fast =fast.next
            count+=1
            
            if count>n+1:
                slow=slow.next
        
        if count == n:#last node
            return head.next
        else:
            slow.next = slow.next.next
            return head