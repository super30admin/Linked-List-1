// Time Complexity                              :  O(N), N is the number of nodes in the linked list
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
        if(head == NULL) return NULL;
        
        ListNode *fast = head, *slow = head;
        
        // Moved fast N times. 
        while(fast->next != NULL and n > 0) {
            fast = fast->next;
            n--;
        }
        
        if(n > 0) return NULL;
        
        // As fast reaches the end, slow will reach the Nth node.
        while(fast->next != NULL) {
            slow = slow->next; 
            fast = fast->next;
        }
        
        ListNode *temp = slow->next;
        slow = temp->next;
        temp->next = NULL;
        delete temp;
        
        
        return head;
        
    }
};