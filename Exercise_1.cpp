// Time Complexity                              :  O(N), N is the number of nodes in the list
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  

// https://leetcode.com/problems/reverse-linked-list/


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
private:
    ListNode *start;
public:
    ListNode* reverseList(ListNode* head) {
        if(head == NULL or head->next == NULL) return head;
        // Recursively reverses the linked list
        // reverseRecur(head);

        // Iteratively reverses the linked list
        reverseIterative(head);
         
        return start;
    }
    
    ListNode* reverseRecur(ListNode* head) {
        if(head->next == NULL) {
            start = head;
            return head;
        }
        ListNode *node = reverseRecur(head->next);
        node->next = head;
        head->next = NULL;
        return head;
    }
    
    void reverseIterative(ListNode *head) {
        ListNode *tmp = NULL;
        ListNode *prev = NULL;
        while(head) {
            if(head->next == NULL) start = head;
            tmp = head->next;
            head->next = prev;
            prev = head;
            head = tmp;
        }
    }
};