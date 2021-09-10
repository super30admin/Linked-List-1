// Time Complexity : O(n)
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :    No


// Your code here along with comments explaining your approach

/*
**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        /* ITERATIVE METHOD
        if(head == NULL) return head; // if null
        ListNode* prev = NULL; // set 3 pointers
        ListNode* curr = head;
        ListNode* fast = head->next;
        while(curr!=NULL){      // iterative over the list and change the links with the pointers
            curr->next = prev;
            prev = curr;
            curr = fast;
            if(fast!=NULL) fast = fast->next;
        }
        return prev;  // points to the head of the list
        */
        
        // RECURSIVE IMPLEMENTATION
        if(head == NULL || head->next == NULL) return head;  // base condition
        ListNode* reversed = reverseList(head->next); // calling recursive function
        head->next->next = head;  // reversing links
        head->next = NULL;
        return reversed;// returning new head
        
    }
};