public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode List1CurrentNode = headA;

        while (List1CurrentNode != null) {

            ListNode List2CurrentNode = headB;

            while (List2CurrentNode != null) {

                if (List1CurrentNode == List2CurrentNode) {
                    return List1CurrentNode;
                }

                List2CurrentNode = List2CurrentNode.next;
            }

            List1CurrentNode = List1CurrentNode.next;
        }

        return null;
    }
}