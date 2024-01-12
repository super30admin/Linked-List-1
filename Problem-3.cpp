// Time Complexity : O(N) 

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes

// Appoarch: Using fast and slow pointers, keep moving until cycle is detected. 
// Once cycle is detected, bring slow to beginning and move both fast n slow by 1.

#include<bits/stdc++.h>
using namespace std;

 // Definition for singly-linked list.
  struct ListNode {
      int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
  };

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode *slow = head;
        ListNode *fast = head;
        while(fast != NULL && fast->next != NULL){
            fast = fast->next->next;
            slow = slow->next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow->next;
                    fast = fast->next;
                }
                return slow;
            }
        }
        return NULL;
    }
};