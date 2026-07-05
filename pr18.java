class Node {
    int key;
    Node left, right;

    Node(int item) {
        key = item;
    }
}

public class pr18 {

    Node root;

    Node insert(Node root, int key) {

        if (root == null)
            return new Node(key);

        if (key < root.key)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    void inorder(Node root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        pr18 tree = new pr18();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
    }
}
