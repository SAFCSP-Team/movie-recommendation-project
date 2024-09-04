import java.util.Stack;


public class DecisionTree {
    Node root;
    public DecisionTree(Node root) {
        this.root = root;
    }

    public void addRight(String parentQu, String newNodeData) {

        Node newNode = new Node(newNodeData);
        Node parent = search(parentQu);

        if (parent != null) {

            if (parent.right == null) {
                parent.right = newNode;
            } else {
                System.out.println("parent already has a right child");
                return;
            }
        } else {
            System.out.println(parentQu + " parent not fount");
        }

    }

    public void addLeft(String parentQu, String newNodeData) {
        Node newNode = new Node(newNodeData);
        Node parent = search(parentQu);

        if (parent != null) {

            if (parent.left == null) {
                parent.left = newNode;
            } else {
                System.out.println("parent already has a right child");
                return;
            }
        } else {
            System.out.println(parentQu + " parent not fount");
        }

    }

    public Node search(String target) {

        if (root == null) {
            System.out.println("Tree is empty");
            return null;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(this.root);

        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();

            if (currentNode.question == target) {
                return currentNode;
            }

            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }

            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }

        }
        return null;
    }
    
    

}