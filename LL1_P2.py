class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def remove_node(head, k):
        counter = 1
        first = head
        second = head

        while counter <= k:
            second = second.next

            counter +=1

        if second is None:
                head.value = head.next.value
                head.next = head.next.next
                return
       while second.next is not None:
           second = second. next
           first = first.next
       first.next = first.next.next

"""

TC : O(N)
SC: O(1)

"""

"""
1) Take 2 pointers, first and second
2)Iterate through the second pointer until it is equal or less than k
3)Then once we are on the data that has to be deleted, move the pointers accordingly.

"""
       
