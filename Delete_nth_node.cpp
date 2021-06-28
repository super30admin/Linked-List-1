// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummy = new ListNode(0);
        dummy->next = head;
        ListNode* first = dummy;
        ListNode* second = dummy;
        int count =0;
        while(count<=n){
            first = first->next;
            count++;
        }
        while(first!=NULL){
            first = first->next;
            second = second ->next;
        }
        
        second->next = second->next->next;
        return dummy->next;
    }
};