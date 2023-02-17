#Time Complexity : O(N), N being the number of values in tree. 
#Space Complexity : O(1), no additional array is used.
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : Did not consider the way to do until 
#tried solution. Issues without dummy node. End cases with indices. 
#Your code here along with comments explaining your approach in three sentences only
'''Traverse n nodes and place a pointer in nth node. Then traverse both pointer and
another pointer at head until pointer is none. Then skip the current pointer. 
'''
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        count = 0
        #create a dummy node, in case n equals length of node. 
        dummy = ListNode(0)
        dummy.next = head
        #assign pointer to dummy and traverse to nth node. 
        temp = dummy
        while(count<=n):
            temp = temp.next
            count = count+1
        #take another pointer at dummy and traverse both pointers till one hits none. 
        temp2 = dummy
        while(temp!=None):
            temp = temp.next
            temp2 = temp2.next
        #skip the next of pointer two. 
        temp2.next = temp2.next.next
        #return dummy.next
        return dummy.next