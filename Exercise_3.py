#Time Complexity : O(N), N being the number of values in tree. 
#Space Complexity : O(1), no additional array is used.
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : Had absolutely no idea how to do it in 
#the beginning. 
#Your code here along with comments explaining your approach in three sentences only
'''Point a slow and fast pointer to the head and increase slow by 1 and fast by 2 nodes. 
If fast is None, then there is no cycle, and if slow and fast is equal there is a cycle. 
Then, using a little algebra for the logic, we place one pointer at head and increase
pointers until they are equal. 
'''
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        #increase slow by one node and fast by two node. 
        while(fast!=None):
            slow = slow.next
            fast = fast.next
            if fast!=None:
                fast = fast.next
            if slow==fast:
                break
        #if fast is none, return none. 
        if fast==None:
            return None
        #if is cycle, increment until pointers are equal. 
        slow = head 
        while(slow!=fast):
            slow = slow.next
            fast = fast.next

        return slow