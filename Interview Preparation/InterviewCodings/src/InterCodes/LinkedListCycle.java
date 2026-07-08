package InterCodes;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class LinkedListCycle {
    
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle using Floyd's Tortoise and Hare
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1
            fast = fast.next.next; // Move fast by 2

            if (slow == fast) {
                // Cycle detected
                break;
            }
        }

        // If no cycle was found
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 2: Find the entry point of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Find the last node of the cycle and remove the cycle
        ListNode cycleEntry = slow;
        ListNode current = cycleEntry;
        while (current.next != cycleEntry) {
            current = current.next;
        }
        current.next = null; // Remove the cycle

        return cycleEntry; // Return the node where the cycle starts
    }
    
    public static void main(String[] args) {
        // Create a linked list with a cycle for testing
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Create a cycle here

        LinkedListCycle cycleDetector = new LinkedListCycle();
        ListNode cycleNode = cycleDetector.detectCycle(head);
        
        if (cycleNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
