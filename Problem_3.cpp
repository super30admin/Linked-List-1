/*
Time complexity:
The time complexity is O(n) as we are traversing the linked list
only once.
*/

/*
Space Complexity:
The space complexity is O(1) as we are not creating any extra space.
*/

/*
Approach: 
We are using the torotise and hare approach. We can assume two pointers 
as fast pointer and slow pointer. The fast pointer moves two step and
slow pointer moves one step. The intution behind this is two atheletes
running in a circular track. If one athelete is slow the other athelete
will cross him after some time. That same idea is used here.

To get the point of enterance or start of circle
we can assume that the distance between the starting point and the slow pointer at
the point of crossing  is a+b where a is the distance from the 
start to the entry point of the circle and the b is the distance
 from entry point to the slow pointer at the point of crossing
let us assume that the distance between the starting point
and the fast pointer at the point of crossing is a + 2b +c. The total distance
travelled by the fast pointer is twice the distance travelled by slow pointer. So,
we can calculate 'a' as
 2(a+b) = a +2b +c
 2a +2b = a +2b +c
 a = c

 so we need to move c distance to find the point of entrance.
 Therefore at the point of crossing, we set one of the pointers to head and keep
 on moving both the pointers by one step. Where these pointers will meet. It will
 be our point of enterance.
*/



class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode *fast = head;
        ListNode *slow = head;
        
        while(fast != NULL && fast->next!= NULL){
            slow = slow->next;
            fast = fast->next->next;
            if(fast == slow){
                fast = head;
                while(fast != slow){
                fast = fast->next;
                slow = slow->next;
                }
                return fast;
            } 
        }
        return NULL;
        
    }
};