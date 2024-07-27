#######206. Reverse Linked List############################################################################################################
// Time Complexity : n
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no problem

// Your code here along with comments explaining your approach in three sentences only
We iterated through the LL and keep change the direction of nodes using prev and temp

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    '''def __init__(self):
        self.res = ListNode(None)'''

    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #global res=ListNode(None)
        return self.helper(None,head)
        #return self.res.next
    
    def helper(self,prev,curr) -> ListNode:
        #base
        if curr is None:
            return prev
        #logic
        #print('start',prev,curr)
        tmp=curr.next
        curr.next=prev
        prev=curr
        curr=tmp
        #print('call helper prev:',prev,' curr is: ',curr)
        return self.helper(prev, curr)
        #print('post recur',prev)


       

#####19. Remove Nth Node From End of List#########################################################################################################


// Time Complexity : n
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA

// Your code here along with comments explaining your approach in three sentences only
We took 2 pointers slow and fast and started fast first an increased the count till it match n and when it matched we started slow pointer also and than increased both of them by 1 till the fast pointer reach at end at that time we will have slow pointer at n-1 and we can take action to remove the nth node as we have access to to it using n-1 node


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy=ListNode(None)
        dummy.next=head
        slow=dummy
        fast=dummy
        cnt=0
        while cnt<n:
            fast=fast.next
            cnt+=1
        print(slow,fast)
        while fast.next is not None:
            print('in 2nd while')
            slow=slow.next
            fast=fast.next
        #slow.next.next=None
        tmp=slow.next
        slow.next=slow.next.next
        tmp.next=None
        return dummy.next
        


#####142. Linked List Cycle II########################################################################################################


// Time Complexity : n
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA

// Your code here along with comments explaining your approach in three sentences only
We used slow and fast pointer where slow move at rate 1x and fast move at a rate of 2x if at any point slow==fast than there is cycle and to find the start of cycle the the meet happens move fast pointer to head and move both pointer at 1x and where they meet is the point where circle start



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        hasCycle=False
        '''if head is None or head.next is None:
            #print('base cond')
        hasCycle'''
        slow=head
        fast=head
        while fast is not None and fast.next is not None:
            #print('in while')
            slow=slow.next
            fast=fast.next.next
            #print(slow,fast)
            if slow==fast:
                hasCycle=True
                break
        if hasCycle==False:
            return None
        else:
            fast=head
            while slow!=fast:
                slow=slow.next
                fast=fast.next
            return slow

        


