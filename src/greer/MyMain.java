package greer;

public class MyMain {

	public static void main(String[] args) {
		
		BST myTree = new BST();
		
		myTree.addNode("Water");
		myTree.addNode("Grass");
		myTree.addNode("Earth");
		myTree.addNode("Fire");
		
		assert myTree.spellCheck("water") == true: "Function is case sensitive";
		
		//this should trigger
		assert myTree.spellCheck("watah") == true: "Word was spelled wrong";

	}

}
