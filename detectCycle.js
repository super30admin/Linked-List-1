/**
 * @param {ListNode} head
 * @return {ListNode}
 * 
 * Intuition:
 * We are using floyd's cycle detection algorithm.
 * 
 * Two pointers, slow and fast, start at the head of the list. 
 * The slow pointer moves one step at a time, while the fast pointer moves two steps.
 * If a cycle exists, the two pointers will eventually meet inside the cycle.
 * If fast reaches the end, there is no cycle.
 * 
 * Once a meeting point is found, we reset slow to the head and move both slow and fast one step at a time. 
 * The point where they meet again is the start of the cycle. 
 * This works because the distance from the head to the cycle start is equal to the distance from the meeting point to the cycle start when moving inside the loop.
 * 
 * 
 */
var detectCycle = function (head) {
    let fast = head;
    let slow = head;

    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        // if fast and slow met then we need to reset slow to head 
        if (fast === slow) break;
    }

    if (!fast || !fast.next) return null;
    slow = head;
    while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
};