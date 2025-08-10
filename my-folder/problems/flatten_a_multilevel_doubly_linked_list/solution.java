/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;

        flattenDFS(head);
        return head;
    }

    private Node flattenDFS(Node node) {
        Node curr = node;
        Node last = null;

        while (curr != null) {
            Node next = curr.next;

            // If current has a child, flatten it
            if (curr.child != null) {
                Node childHead = curr.child;
                Node childTail = flattenDFS(childHead);

                // Insert child list between curr and next
                curr.next = childHead;
                childHead.prev = curr;

                // Connect child's tail to next
                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                // Clear the child pointer
                curr.child = null;

                last = childTail; // update last to child's tail
                curr = childTail; // move current to tail of child list
            } else {
                last = curr; // update last as we move
            }
            curr = curr.next;
        }
        return last;
    }
}