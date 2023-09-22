package greer;

public class BST {
	
	public Node root;
	
	public BST() {
		root = null;
	}
	
	public void addNode(String word) {
		Node temp = new Node(word);
		
		//tree is empty
		if(root == null) {
			root = temp;
		} else {
			insert(root, temp);
		}
	}
	
	private void insert(Node myRoot, Node temp) {
		while(true) {
			//ignore duplicate words
			if(temp.word.compareTo(myRoot.word) == 0) {
				return;
			}
			//travel to the left side
			if(temp.word.compareTo(myRoot.word) <= -1) {
				if(myRoot.left != null) {
					myRoot = myRoot.left;
				} else {
					myRoot.left = temp;
					break;
				}
			//travel to the right side
			} else {
				if(myRoot.right != null) {
					myRoot = myRoot.right;
				} else {
					myRoot.right = temp;
					break;
				}
			}
		}
	}
	
	public void inOrder() {
		inOrderRecursive(root);
	}

	private void inOrderRecursive(Node myRoot) {
		if(myRoot != null) {
			inOrderRecursive(myRoot.left);
			System.out.println(myRoot.word);
			inOrderRecursive(myRoot.right);
		}
		
	}
	
	public boolean spellCheck(String word) {
		Node tempNode = root;
		
		while(true){
			if(tempNode.word.equalsIgnoreCase(word)) {
				return true;
			}
			if(tempNode.word.compareTo(word) <= -1) {
				if(tempNode.left != null) {
					tempNode = tempNode.left;
				} else {
					return false;
				}
			} else {
				if(tempNode.right != null) {
					tempNode = tempNode.right;
				} else {
					return false;
				}
			}
			assert tempNode != root: "The tempNode did not get changed";
		}
		
	}
}
