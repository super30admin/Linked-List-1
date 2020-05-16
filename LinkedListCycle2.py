# Brute Force
# Time Conplexity: O(N) where N is the Number of Nodes
#Space Complexity: O(N) where N is Number of Nodes stored in Hashmap


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        d= {}
        current = head
        while(current!=None):
            if current in d:
                return current
            
            else:
                d[current]=1
            current=current.next
            
            
### without space

# Time Conplexity: O(N) where N is the Number of Nodes
#Space Complexity: O(1)
            
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        fast = head
        slow = head
        flag = False
        while(fast!=None and fast.next !=None):
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break;
        if flag == False:
            return None
        slow = head
        while(slow!=fast):
            slow= slow.next
            fast =fast.next
        return slow