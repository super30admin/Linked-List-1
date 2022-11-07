/*
Time Complexity: O(n)To go through the whole linked list) 
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/

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
        return reverseListRec(head);
    }
    ListNode* reverseListRec(ListNode* node){
        if(node == NULL || node->next == NULL){
            return node;
        }
        ListNode* newHead = reverseListRec(node->next);
        node->next->next = node;
        node->next = NULL;
        return newHead;
    }
};