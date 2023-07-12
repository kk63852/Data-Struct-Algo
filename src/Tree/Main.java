package Tree;

public class Main {

	public static void main(String args[]) {
		TreeNode drinks =new TreeNode("Drinks");
		TreeNode hot =new TreeNode("hot");
		TreeNode cold =new TreeNode("cold");
		TreeNode tea =new TreeNode("tea");
		TreeNode coffee =new TreeNode("coffee");
		TreeNode wine =new TreeNode("wine");
		TreeNode beer =new TreeNode("beer");
		drinks.addChild(hot);
		drinks.addChild(cold);
		hot.addChild(tea);
		hot.addChild(coffee);
		cold.addChild(wine);
		cold.addChild(beer);
		System.out.println(drinks.print(0));
	}
}
