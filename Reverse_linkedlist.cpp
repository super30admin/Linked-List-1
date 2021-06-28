// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode *curr = head;
        ListNode *prev=NULL;
        ListNode* next=NULL;
        while(curr!=NULL){
            next = curr->next;
            curr->next = prev; 
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
};
