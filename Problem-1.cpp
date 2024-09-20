// Time Complexity : O(n) n is length of linked list
// Space Complexity : O(1) constant time
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
        if(head == NULL || head->next == NULL)
            return head;
        ListNode* prev = NULL;
        ListNode* nextNode = head->next;
        ListNode* curr = head;
        while(curr)
        {
            curr->next = prev;
            prev = curr;
            curr = nextNode;
            if(nextNode!=NULL)
                nextNode = nextNode->next;
        }
        return prev;
    }
};