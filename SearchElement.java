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

        tree.inorder();

        String elementSearch = "Jones";
        System.out.println("\nElement " + elementSearch + " is exist in BST: " + tree.search(elementSearch));
    }
}
