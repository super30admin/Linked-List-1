
# Time Complexity : O(n) size of LL
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach class Solution(object):

    def detectCycle(self, head):
        # floyd's algo to find cycle. temp ptr to get the index
        flag = False
        slow = fast = head
        while fast and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        
        if slow == fast and flag:
            temp = head
            while temp != slow:
                temp = temp.next
                slow = slow.next
            return temp
        return None
        