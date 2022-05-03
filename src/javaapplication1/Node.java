package javaapplication1;

/**
 *
 * @author Darag
 */
public class Node {

    Node left;
    Node right;
    Node top;
    Node bottom;
    Node diagonalTopLeft;
    Node diagonalBottomRight;
    Node diagonalTopRight;
    Node diagonalBottomLeft;
    Object data;

    public Node() {

    }

    public Node(Object data) {
        this.data = data;
    }

}
