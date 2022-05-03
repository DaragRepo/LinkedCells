package javaapplication1;

/**
 *
 * @author Darag
 */
public class LinkedCells {

    private Object arr[][];
    private Node nodes[][];

    public LinkedCells(Object arr[][]) {
        this.arr = arr;
        createNodesFor2D();
    }

    private void createNodesFor2D() {
        nodes = new Node[arr.length][arr.length];

        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr.length; cols++) {
                Node n = new Node();

                n.data = arr[rows][cols];
                n.left = cols > 0 ? new Node(arr[rows][cols - 1]) : null;
                n.right = cols < arr.length - 1 ? new Node(arr[rows][cols + 1]) : null;
                n.top = rows > 0 ? new Node(arr[rows - 1][cols]) : null;
                n.bottom = rows < arr.length - 1 ? new Node(arr[rows + 1][cols]) : null;
                n.diagonalTopLeft = rows > 0 && cols > 0 ? new Node(arr[rows - 1][cols - 1]) : null;
                n.diagonalBottomRight = rows < arr.length - 1 && cols < arr.length - 1 ? new Node(arr[rows + 1][cols + 1]) : null;
                n.diagonalTopRight = rows > 0 && cols < arr.length - 1 ? new Node(arr[rows - 1][cols + 1]) : null;
                n.diagonalBottomLeft = rows < arr.length - 1 && cols > 0 ? new Node(arr[rows + 1][cols - 1]) : null;

                nodes[rows][cols] = n;
            }
        }

        for (int row = 0; row < nodes.length; row++) {
            for (int col = 0; col < nodes.length; col++) {
                nodes[row][col].left = col > 0 ? nodes[row][col - 1] : null;
                nodes[row][col].right = col < arr.length - 1 ? nodes[row][col + 1] : null;
                nodes[row][col].top = row > 0 ? nodes[row - 1][col] : null;
                nodes[row][col].bottom = row < arr.length - 1 ? nodes[row + 1][col] : null;
                nodes[row][col].diagonalTopLeft = row > 0 && col > 0 ? nodes[row - 1][col - 1] : null;
                nodes[row][col].diagonalBottomRight = row < arr.length - 1 && col < arr.length - 1 ? nodes[row + 1][col + 1] : null;
                nodes[row][col].diagonalTopRight = row > 0 && col < arr.length - 1 ? nodes[row - 1][col + 1] : null;
                nodes[row][col].diagonalBottomLeft = row < arr.length - 1 && col > 0 ? nodes[row + 1][col - 1] : null;
            }
        }

    }

    Node[][] getInstance() {
        return nodes;
    }

    public void setArray(Object arr[][]) {
        this.arr = arr;
        createNodesFor2D();
    }

}
