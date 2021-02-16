package bean;

public class Node {

    public String val;
    public Node next;
    public Node random;

    public Node(String val){}

    public Node(String val,Node next,Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }

}
