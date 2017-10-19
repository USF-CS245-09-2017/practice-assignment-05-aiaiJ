public class BSTNode{

	String data;
	BSTNode left;
	BSTNode right;	
	public BSTNode(){
		left = null;
		right = null;
		data = null;
	}
	public BSTNode(String data){
		this.data = data;
		left = null;
		right = null;
	}
	public void setLeft(BSTNode n){
		
		left = n;
	}
	public void setRight(BSTNode n){
	 
	 	right = n;
	}
	public BSTNode getLeft(){

		return left;
	}

	public BSTNode getRight(){
		
		return right;
	}
	
	public void setData(String n){

	 data = n;
	}
	public String getData(){
	 
	 return data;
	}   



}