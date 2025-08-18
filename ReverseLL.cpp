#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
struct ListNode{
    int val;
    ListNode* next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr){}
    ListNode(int x, ListNode* next) : val(x), next(next){}
};
/*
we have a prev pointer pointing to null and a curr pointing to head
then create a temp node and assign it with current's next then assign prev to 
current's next and then curr to prev, finally temp to curr
*/
class Solution{
public:
    ListNode* reverseList(ListNode* head){
        //TC:O(n) SC: O(1) 
        ListNode* prev = nullptr;
        ListNode* curr = head;
        while(curr != nullptr){
            ListNode* nextTemp = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
};
