// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
//We start with slow and fast pointer abd traverse till we reach end of the list or fast and slow pointer are equal 
//if the pointer meet at one point the cycle exists
//We start one of the pointers from the head and move till both the pinters meet again. We finally return that value.

var detectCycle = function (head) {
    let slow = head;
    let fast = head;
    let bool = false;
    while (fast !== null && fast.next !== null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow === fast) {
            bool = true;
            break;
        }
    }
    if (!bool) return null;
    fast = head;
    while (slow !== fast) {
        slow = slow.next;
        fast = fast.next;
    }

    return slow;

};