// Time Complexity : O(N) 

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes

// Appoarch: Using recursion reversed it.

// 206. Reverse Linked List

#include<bits/stdc++.h>
using namespace std;

 // Definition for singly-linked list.
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
        if(head == NULL || head->next == NULL) return head;
        ListNode* reverse = reverseList(head->next);
        head->next->next = head;
        head->next = NULL;
        return reverse;
    }
};