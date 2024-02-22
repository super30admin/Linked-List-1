// TC = O(N)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        // TC = O(N), SC = O(N) (Recursive stack)
        // base
        // if(head == NULL || head->next == NULL) return head;
        // // logic
        // ListNode* reversed = reverseList(head->next);
        // head->next->next = head;
        // head->next = NULL;
        // return reversed;
        
        // TC = O(N), SC = O(1)
        // base
        if(head == NULL || head->next == NULL) return head;
        ListNode *prev = NULL, *curr = head, *fast = head->next;
        while(fast != NULL) {
            curr->next = prev;
            prev = curr;
            curr = fast;
            fast = fast->next;
        }
        curr->next = prev;
        return curr;
    }
};