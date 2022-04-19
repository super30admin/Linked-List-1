#remove-nth-node-from-end-of-list


# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no



def removeNthFromEnd( head, n):
    dummy = ListNode(-1)
    dummy.next=head
    slow=dummy
    fast=dummy
    i=0
    while(i<=n):                                    #make the difference between fast and slow the n that is given
        fast = fast.next
        i+=1
    while (fast!=None):                             #when fast finally reaches to the end, you know nth term would be the next of slow pointer
        slow=slow.next
        fast = fast.next
    slow.next=slow.next.next                        #set next of slow to slow.next.next
    return dummy.next

