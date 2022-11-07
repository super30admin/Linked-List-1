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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp = new ListNode(-1);
        temp->next = head;
        ListNode* right = temp;
        ListNode* left = temp;
        for(int i=0;i<n;i++){
            right=right->next;
        }
        while(right->next!=NULL){
            left=left->next;
            right=right->next;
        }
        left->next=left->next->next;
        return temp->next;
    }
};