// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//142. Linked List Cycle II
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head): //T.C->O(N),O(1)
        """
        :type head: ListNode
        :rtype: ListNode
        """
        
        slow = head
        fast = head
        flag = True

        while fast!=None and fast.next!=None:
            slow = slow.next
            fast = fast.next.next
            if(slow == fast):
                flag = False
                break

        slow = head
        if(flag == False):
            while slow!=fast:
                slow = slow.next
                fast = fast.next
            return slow

        return None


//206. Reverse Linked List
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head): //T.C->O(N),S.C->O(1)
        """
        :type head: ListNode
        :rtype: ListNode
        """

        prev = None
        curr = head

        while curr != None:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        head = prev
        return head

//remove-nth-node-from-end-of-list
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object): //T.C -> O(N),S.C->(1)
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummy = ListNode(-1)
        dummy.next = head

        slow = dummy
        fast = dummy

        count = 0

        

        #fast pointer at N place 
        while count <= n:
            fast = fast.next
            count+=1
        
        #go to target-1 using slow pointer until fast is not equal to null
        while fast != None:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next
