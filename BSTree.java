public class BSTree{

	public static  BSTNode root;
	
	public BSTree(){
		
		this.root = null;
	}

	public void insert(String string){
		 
		 root = insert(root, string);
	
	}
	
	private BSTNode insert(BSTNode node, String string){

		if (node == null){
			
			return node = new BSTNode(string);
		
		}else{
			
			if (string.compareTo(node.data)<=0){
		 		
		 		node.left = insert(node.left, string);
		 		return node;
			
			}else{
		 	
		 		node.right = insert(node.right, string);
		 		return node;
			}
		}
	}

	public boolean find(String string){

		return(find(root, string));
	}

	public boolean find(BSTNode node, String string){

		if(node == null){

			return false;
		}
		if(string.compareTo(node.data)==0){
			return true;
		}
		if(string.compareTo(node.data)<0){
			
			return find(node.left, string);
		
		}else{
			return find(node.right, string);
		}
	}
	public void delete (String string){

		root=delete(string, root);
	}

	private BSTNode delete(String string, BSTNode node){

		if(node==null){
			
			return null;
		}
		if(string.compareTo(node.data)==0){
			
			if(node.left==null){
				
				return node.right;
			
			}
			
			else if(node.right == null){
				
				return node.left;
			
			}else{

				if(node.right.left==null){
					node.data=node.right.data;
					node.right=node.right.right;
					return node;

				}else{
				
					node.data=removeSmallest(node.right);
					return node;
				}
			}
			
		}else if(string.compareTo(node.data)<0){

			node.left = delete(string,node.left);
			return node;
		}else{
			node.right = delete(string,node.right);
			return node;
		}
	}
	public String removeSmallest(BSTNode node){

		if(node.left.left==null){
			
			String smallest = node.left.data;
			node.left=node.left.right;
			return smallest;
		
		}else{
			
			return removeSmallest(node.left);
		}
	}

	public String toStringInOrder(){

		return(toStringInOrder(root).trim());
	}
	public String toStringInOrder(BSTNode node){

		String result = "";
		
		if (node!=null){
			
			result = result + toStringInOrder(node.left);
			result = result + node.data + " " ;
			result = result + toStringInOrder(node.right);

		}
		return result;
	}

	public String toStringPreOrder(){

		return(toStringPreOrder(root).trim());
	}
	public String toStringPreOrder(BSTNode node){

		String result = "";
		
		if (node!= null){

			result = result + node.data + " ";
			result = result + toStringPreOrder(node.left);
			result = result + toStringPreOrder(node.right);
		}
		return result;
	}

}