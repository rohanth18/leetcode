class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // Empty list
        if (head == null) {
            return head;
        }

        // Remove all matching nodes from the beginning
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode temp = head;

        // Remove matching nodes from the remaining list
        while (temp != null && temp.next != null) {

            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}