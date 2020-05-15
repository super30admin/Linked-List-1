// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// 1. Initialize two pointers pointing to dummy node before head and advance one pointer by n+1 steps
// 2. Now move both pointers ahead by one till the already moved pointer reaches the end
// 3. Now the other pointer points at (n-1)th node from end, replace its next by next to next node to remove nth node

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* prev = new ListNode(0);
        prev->next = head;
        ListNode* first = prev;
        ListNode* second = prev;
        
        for(int i=0; i<n+1; i++)
            second = second->next;
        while(second != nullptr){
            //prev = first;
            first = first->next;
            second = second->next;
        }
        first->next = first->next->next;
        return prev->next;
    }
};