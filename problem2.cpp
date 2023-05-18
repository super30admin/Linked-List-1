// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// we create a gap of n iniatially itself and take two pointers and traverse till second pointer reaches the end;
// we then remove the first pointers next node.

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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head ==NULL || n==0) return head;
        ListNode* dummy = new ListNode();
        dummy->next = head;
        ListNode* curr = dummy;
        ListNode* temp = dummy;
        while(n--)
        {
            temp = temp->next;
        }
        while(temp->next!=NULL)
        {
            curr=curr->next;
            temp = temp->next;
        }
        curr->next = curr->next->next;
        
        return dummy->next;
    }
};