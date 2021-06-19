# Using Set
# Time Complexity: O(n)
# Space Complexity: O(n)
# Two pointer approach: slow and fast
# Time Complexity: O(n)
# Space Complexity: O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        # Using Set
        List_Set = set()
        temp = head

        while temp:
            # Check if the node exists in set, if yes, return True
            if temp in List_Set:
                return temp
            # If node does not exist in temp, add to set
            List_Set.add(temp)
            temp = temp.next
        return
    
#         # Two pointer approach: slow and fast
#         slow = fast = head
#         flag = False
        
#         # Check both fast and fast.next for odd and even array length
#         # fast is 2x slow
#         # When they become equal change the flag to true and break
#         while fast and fast.next:
#             slow = slow.next
#             fast = fast.next.next
#             if slow == fast:
#                 flag = True
#                 break
        
#         # Check if flag is false, return 
#         if flag == False: 
#             return
        
#         # In the else condition, make slow again head 
#         # Both traverse at 1x and they are certain to meet at the head of the circle
#         slow = head
#         while slow != fast:
#             slow = slow.next
#             fast = fast.next
#         # Return head or slow when they meet
#         return slow
            