/* Problem Statement:
Verified on leetcode

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Note: Do not modify the linked list.

 

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.

 *
 * Time Complexity : O(n) 
 * Space Complexity : O(1)
 */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#include<math.h>
#include<limits.h>



  struct ListNode {
      int val;
      struct ListNode *next;
  };
 
/*
                                                                         b distance
     +--------------+ a +--------------------------+ XX XX XXX XXXXXX
                                                                     XXXX
   +------------------------------------------------+ X X  X X XXXXXX   XXX
                                                 XX                  XX    XX
                                               XX                      XX   XX
                                               X                        X    X
                                              X                          X
                                             XX                           X  slow = fast (when first time loop detected)
     fast = 2 * slow (moves 2 times fast)    X                            X
                                             X                            X
                                             X                            X
                                             XX                           X
 a + k*x + b = 2 * (a + k*y + b)              X                          X
                                               XX                       X
                                                XX                    XX
 a + b = (x - 2y)*k                               XXX            XX XX
                                                     XXXXXX XX XX
It implies start one ptr from head ptr
 and another from slow ptr                   Circumference of circle = k


*/
struct ListNode *detectCycle(struct ListNode *head) {
    struct ListNode *slow = NULL;
    struct ListNode *fast = NULL;
    struct ListNode *temp = NULL;
    
    /* Validations */
    if (!head) {
        return NULL;
    }
    if (head->next == NULL) {
        return NULL;
    }
    
    if (head->next == head) {
        return head;
    }
    /* Init slow and fast with head pointer */
    slow = head;
    fast = head;

    /* Keep on running unless the conditions fail  */
    while (slow != NULL && fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
        /* Once we find a loop, now we take another pointer which starts from head and keep itearting it with slow pointer so that the point where they meet will be the starting point of the loop. */
        if (slow == fast) {
            temp = head;
            while (temp != slow) {
                temp=temp->next;
                slow=slow->next;
            }
            return slow;
        }
    }

    return NULL;
}
