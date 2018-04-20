public class SearchElement {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        System.out.println("Browser inorder: ");
        tree.inorder();
        System.out.println("\nBrowser postorder: ");
        tree.postorder();
        System.out.println("\nBrowser preorder: ");
        tree.preorder();

        String elementSearch = "Jones";
        System.out.println("\nElement " + elementSearch + " is exist in BST: " + tree.search(elementSearch));
    }
}
