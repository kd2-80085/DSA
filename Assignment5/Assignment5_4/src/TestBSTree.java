
public class TestBSTree {

	public static void main(String[] args) {

		BSTree bst = new BSTree();
		
		//bst.addNode(8);
		//bst.addNode(3);
//		bst.addNode(10);
//		bst.addNode(1);
//		bst.addNode(6);
//		bst.addNode(14);
//		bst.addNode(4);
//		bst.addNode(7);
//		bst.addNode(13);
		
		BSTree tree = new BSTree();
	    int valuesToAdd[] = {50, 30, 70, 20, 40, 60, 80};

	    for (int value : valuesToAdd) {
	        tree.recAddNode(value);
	    }

	    tree.preOrder();
	   tree.inOrder();
	    tree.postOrder();
	}

}
