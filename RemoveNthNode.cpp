// Time Complexity : O(N) where N is the number of elements in the linkedlist
// Space Complexity : O(1) as I am not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Submission Link: https://leetcode.com/submissions/detail/540116262/

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int cnt = 0;
        
        ListNode* slow = head;
        ListNode* fast = head;
        ListNode* prev = NULL;
        
        while(fast != NULL){
            if(cnt >= n){
                prev = slow;
                slow = slow -> next;
            }
            
            fast = fast -> next;
            cnt++;
        }
        
        if(prev == NULL){
            head = head -> next;
            return head;
        }
        
        prev -> next = slow -> next;
        slow = NULL;
        
        return head;
    }
};