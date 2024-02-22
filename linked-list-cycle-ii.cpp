// TC = O(N)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

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
    ListNode *detectCycle(ListNode *head) {
        // TC = O(N), SC = O(1)
        // null
        if(head == NULL) return NULL;
        ListNode* slow = head;
        ListNode* fast = head;
        bool hasCycle = false;
        // detecting cycle
        while(fast != NULL && fast->next != NULL) {
            slow = slow->next;
            fast = fast->next->next;
            if(slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if(hasCycle == false) return NULL; // no cycle found
// to find the beginning of the cycle -> 2(a + b) = a + b + c + b  => a = c, now move both at same speed
        slow = head;
        while(slow != fast) {
            slow = slow->next;
            fast = fast->next;
        }
        return slow; // or return fast as they both point to the same node
    }
};