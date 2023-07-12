package Tree;

import java.util.ArrayList;

public class TreeNode {
String data;
ArrayList<TreeNode> children;//because children of nodes will be type TreeNode only 

public TreeNode(String data) {
	this.data=data;
	this.children=new ArrayList<TreeNode>();
}

public void addChild(TreeNode node) {
	children.add(node);
}

//to see how the tree would look
public String print(int level) {
	String ret;
	ret="  ".repeat(level)+data+"\n";
	for(TreeNode node: this.children) {
		ret+=node.print(level+1);
	}
	return ret;
}
}
