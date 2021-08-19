// Time Complexity : O(N) where N is the number of elements in the linkedlist
// Space Complexity : O(1) as I am not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/linked-list-cycle-ii/
// Submission Link: https://leetcode.com/submissions/detail/541146058/

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head == NULL)
            return NULL;
        
        ListNode* fast = head;
        ListNode* slow = head;
        
        while(fast != NULL && fast -> next != NULL){
            fast = fast -> next -> next;
            slow = slow -> next;
            
            if(slow == fast)
                break;
        }
        
        if(fast == NULL || fast -> next == NULL)
            return NULL;
        
        slow = head;
        
        while(slow != fast){
            slow = slow -> next;
            fast = fast -> next;
        }
        
        return slow;
    }
};