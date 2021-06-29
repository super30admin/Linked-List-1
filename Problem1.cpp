// Time Complexity : O(n) one pass
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Reverse Linked List

#include<iostream>
using namespace std;  
  
struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};
 
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode *curr = head;
        ListNode *prev = NULL;
        ListNode *fwd = NULL;

        if(head == NULL || head->next == NULL)      // NULL CASE
            return head;

        while(curr != NULL){
            fwd = curr->next;
            curr->next = prev;
            prev = curr;
            curr = fwd;
        }

        return prev;
    }
};