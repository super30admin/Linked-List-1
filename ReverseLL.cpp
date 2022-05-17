// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

class Solution {
public:
    
    ListNode *th = NULL;
    ListNode *tt = NULL;
    
    void addFirst(ListNode *c) {
        if(th == NULL && tt == NULL) {
            th = tt = c;
        } else {
            c->next = th;
            th=c;
        }
    }
    
    ListNode* reverseList(ListNode* head) {
        if(head == NULL || head->next == NULL) {
            return head;
        }
        ListNode *c = head;
        
        while(c != NULL) {
            ListNode *f = c -> next;
            c -> next = NULL;
            addFirst(c);
            c = f;
        }
        return th;
    }
};