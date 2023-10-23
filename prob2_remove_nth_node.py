# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        """
        Time Complexity:
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach:
            - if it's just one element and if the element to be removed is also 
            1st node from the end of the list, then return None
            - Else
                - use pointer to count the no of elements in the linked list
            - Now, if the element to be removed is the first element in the list(head)
                - then assign head.next as head and return the head 
            - else traverse towards the node before the node to be removed
                - assign node.next.next as node.next
                - exit the loop 
            - return the head
        """        
        fast = head
        if fast.next == None:
            count = 1
            if n == 1:
                return None
        else:
            count = 1
            if fast.next.next == None:
                count = 2
            else:
                while (fast.next != None and fast.next.next != None):
                    fast = fast.next.next
                    if fast.next == None:
                        count += 2
                    elif fast.next.next == None:
                        count += 3
                    else:                        
                        count += 2
        c = 0
        remove = head
        if count - n == 0:
            head = head.next
            return head
        while c < count - n:
            c += 1
            if c == count - n:
                front = remove.next.next
                remove.next = front
            remove = remove.next
        return head
