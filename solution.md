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
### Solution:
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
              

# Problem 2
## Time Complexity :


## Space Complexity :


## Did this code successfully run on Leetcode :

## Any problem you faced while coding this :


## Your code here along with comments explaining your approach
### Solution:
