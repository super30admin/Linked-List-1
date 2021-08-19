// Time Complexity : O(N) where N is the number of elements in the linkedlist
// Space Complexity : O(1) as I am not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/reverse-linked-list/
// Submission Link: https://leetcode.com/submissions/detail/541149472/

class Solution {
    ListNode* head;
public:
    ListNode* reverseList(ListNode* head) {
        if(head == NULL)
            return head;
        
        if(head -> next == NULL)
            return head;
        
        ListNode* prev = NULL;
        ListNode* cur = head;
        ListNode* next;
        
        while(cur != NULL){
            next = cur -> next;
            cur -> next = prev;
            head = cur;
            prev = cur;
            cur = next;
        }
        
        return head;
    }
};