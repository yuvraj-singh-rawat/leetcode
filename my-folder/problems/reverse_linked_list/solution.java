/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // Previous pointer
        ListNode curr = head; // Current pointer
        ListNode next;

        while (curr != null) {
            next = curr.next; // save next
            curr.next = prev; // Reverse current node's pointer
            prev = curr; // Move prev to current
            curr = next; // Move curr to the next node
        }

        return prev; // New head of the reversed list
    }
}