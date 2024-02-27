/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

/*
Time: O(N)
Space: O(N) (Stack space)

Recrusively go to the end of the list and then count back 
When we reach n nodes from end, skip that node and returns its next
*/

int i;

struct ListNode* call(struct ListNode* head, int n){
    if(head==NULL)  return NULL;
    head->next = call(head->next, n);
    
    i++;
    
    if(i==n)  return head->next;    
    return head;
}

struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    i= 0;
    
    return call(head,n);
}
