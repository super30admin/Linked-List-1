#
# @lc app=leetcode id=19 lang=python3
#
# [19] Remove Nth Node From End of List
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
'''
Time Complexity = O(n). We are traversing the entire LinkedList
Space Complexity = O(1). Only extra variables being used as pointers.

This code works on Leetcode
'''
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode() #create dummy
        dummy.next = head #make it point to head
        if head.next == None:
            return None #if only one node return None as LinkedList will be empty
        ctr = 0 
        fast = dummy #make fast and slow pointer point to dummy node
        slow = dummy
        while fast != None: #continue till the last node
            if ctr <= n: #only move fast pointer till there is a diff of n nodes between slow and fast
                ctr+=1 #increment the pointer as well
                fast = fast.next
            else:
                slow = slow.next #move both pointers when ctr > n
                fast = fast.next
        slow.next = slow.next.next #we reach 1 node before the target node. we just make the next of this node point to the next of target node.
        return dummy.next #return the next of dummy node as dummy was not present previously.

        
# @lc code=end

