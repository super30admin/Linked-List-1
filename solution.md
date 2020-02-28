# Problem 1
## Time Complexity :
O(n)

## Space Complexity :
O(1)

## Did this code successfully run on Leetcode :
Yes.
## Any problem you faced while coding this :
No. 

## Your code here along with comments explaining your approach
### Solution 1: Iterative
      class Solution:
          def reverseList(self, head: ListNode) -> ListNode:
              prev = None #Initialize prev
              while head: #Condition: Run till head is not null
                  #Logic
                  curr = head
                  head = head.next
                  curr.next = prev
                  prev = curr
              return prev
### SOLUTION 2: Recursive
            class Solution:
                def reverseList(self, head: ListNode) -> ListNode:
                    return self.helper(head)

                def helper(self, head, prev=None):
                    if not head:
                        return prev
                    curr = head.next
                    head.next = prev
                    return self.helper(curr, head)

# Problem 2
## Time Complexity :
O(n)

## Space Complexity :
O(1)

## Did this code successfully run on Leetcode :
Yes.

## Any problem you faced while coding this :
No.

## Your code here along with comments explaining your approach
### Solution:
      class Solution:
          def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
              dummy=ListNode(-1)  #Creating dummy node for edge case
              dummy.next=head #Pointing dummy node to head
              count=0
              #Initializing pointers
              slow=dummy
              fast=dummy
              #Logic1: Incrementing fast pointer till 'n' nodes apart
              while count<=n:
                  fast=fast.next
                  count+=1
              #Logic2: Incrementing both pointers till null
              while(fast!=None):
                  slow=slow.next
                  fast=fast.next
              #Removing node at slow pointer
              slow.next=slow.next.next
              return dummy.next

# Problem 3
## Time Complexity :
O(n)

## Space Complexity :
O(1)

## Did this code successfully run on Leetcode :
Yes.
## Any problem you faced while coding this :
No. 

## Your code here along with comments explaining your approach
### Solution:
            class Solution:
                def detectCycle(self, head: ListNode) -> ListNode:
                    #Edge Case
                    if head==None:
                        return None
                    #Initializing pointers
                    slow=head
                    fast=head
                    flag=False
                    #Base Case
                    while(fast!=None or fast.next!=None):
                        slow=slow.next
                        fast=fast.next.next
                        if(slow==fast):
                            flag=True
                            break       #Breaking the loop when 2 pointers meet
                    if(!flag):
                        return None
                    slow=head       #Resetting slow pointer
                    while(slow!=fast):      #Incrementing both pointers till they meet
                        slow=slow.next
                        fast=fast.next
                    return slow
