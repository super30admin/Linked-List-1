/*The algorithm iterates through the linked list, reversing the direction of the pointers. 
It uses three pointers: prev, current, and next. 
Time complexity is O(N), where N is the number of nodes in the linked list, 
Space complexity is O(1) as it uses a constant amount of extra space regardless of the input size.*/
#include<bits/stdc++.h>
using namespace std;
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
        ListNode* prev = nullptr;
        ListNode* curr=head;
        ListNode* next= nullptr;
        while(curr!=nullptr){
            next=curr->next;
            curr->next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

        //recursion
         // if(head == NULL || head->next == NULL){
            //     return head;
            // }
            // ListNode* p =reverseList(head->next);
            // head->next->next = head;
            // head->next = NULL;
            // return p;
    }
};

