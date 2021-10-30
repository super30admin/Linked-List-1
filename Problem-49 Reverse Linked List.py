# 206. Reverse Linked List
# https://leetcode.com/problems/reverse-linked-list/

# Iterrative Approach - Inefficient
# Time Complexity: O(n)
# Space Complexiety: O(n)

# Logic: 


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head):
        if not head:
            return
        
        stack = list()
        
        ptr = head
        
        while ptr:
            stack.append(ptr.val)
            ptr = ptr.next
            
        item = stack.pop()
        new_node = ListNode(item)
        head = new_node
        ptr = head
        
        while stack:
            item = stack.pop()
            new_node = ListNode(item)
            ptr.next = new_node
            ptr = ptr.next
        return head


# Iterrative Approach - Efficient
# Time Complexity: O(n)
# Space Complexiety: O(1)

# Logic: Use 3 pointers. before is set to none, cur is set to head and 
# after is set to head.next. Use temp pointer to save the next ptr ahead 
# of after and according change and move all the ptrs.
class Solution:
    def reverseList(self, head):
        if head == None:
            return head
        
        before = None
        cur = head
        after = head.next
        
        while after:
            temp = after.next
            after.next = cur
            cur.next = before
            before = cur
            cur = after
            after = temp
        
        head = cur
        return head