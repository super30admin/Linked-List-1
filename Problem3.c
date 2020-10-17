/* Problem Statement:
Verified on leetcode

Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.

Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?

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
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    int idx = 0;
    
    if(head == NULL)
        return NULL;
 
    struct ListNode* fast = head;
    struct ListNode* slow = head;
 
    /* Move fast ptr till n */
    for(idx = 0; idx<n; idx++){
        fast = fast->next;
    }

    /* What if delete the first element itself */
    if (fast == NULL) {
        head = head->next;
    } else { /* move slow till fast reaches the end */
        while(fast->next != NULL){
            fast = fast->next;
            slow = slow->next;
        }
 
        slow->next = slow->next->next; 
    }

    return head;
}


