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
    public boolean isPalindrome(ListNode head) {
        /* int num = 0;
        ListNode currentNode = head;
        while(currentNode != null)
        {
            num = num*10 + currentNode.val;
            currentNode = currentNode.next;
        }
        int numcopy = num;
        int rev = 0;
        while(numcopy != 0)
        {
            int digit = numcopy%10;
            rev = rev*10+digit;
            numcopy=numcopy/10;
        }
        if(rev == num)
        {
            return true;
        }
        return false; */
        int count = 0;
        ListNode currentNode = head;
        while(currentNode != null)
        {
            count++;
            currentNode = currentNode.next;
        }
        int[] array = new int[count];
        int i = 0;
        ListNode current = head;
        while(i < array.length)
        {
            array[i] = current.val;
            i++;
            current = current.next;
        }
        int j = array.length - 1;
        for(int k = 0; k < array.length; k++)
        {
            if(array[k] != array[j])
            {
                return false;
            }
            j--;
        }
        return true;
    }
}