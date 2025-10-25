package com.dherbet.codility.Other questions;

import java.util.List;

public class Node {

    // Dummy method which returns the node ID
    public int nodeId(){
        // Placeholder
    }

    // Dummy method which returns a list of child nodes.
    public List<Node> getChildren(){
        // Placeholder
    }

    // Dummy method which returns the parent node. 
    public Node getParent(){
        // Place holder 
    }

    // Question 1a: Prepare a method which returns the root node of the tree.
    public Node getRootNode(){
        // Start from the current node. If it is the root node, the while loop will not run and it will return the root node
        Node node = this;
        // Start a while loop and update the node with the parent node every time the getParent doesn't return null 
        while(node.getParent() != null){
            node = node.getParent();
        }
        return node;
    }

    // Question 1b: Prepare a method which returns the root node of the tree using recursion.
    public Node getRootNodeRecursion() {   
        // If the current node has no parent it means that it is the root node. 
        // This is the break clause. 
        if (this.getParent() == null) {
            return this;
        } else {
        // If the current node has a parent, keep calling getRootNodeRecursion on the parent until the parent has no parent meaning it is the root node. 
            Node parent = this.getParent();
            return parent.getRootNodeRecursion();
        }
    }

    // Question 2: Prepare a method which returns a list of nodes from the given node to the root node.
    public List<Node> getPathNodes(){
        
        List<Node> nodeList = new List<Node>();

        Node node = this;

        //Add the current node to the nodeList
        nodeList.add(node);

        // Start a while loop and add the parent node at every iteration to the list.
        while(node.getParent() != null){
            node = node.getParent();
            nodeList.add(node);
        }

        return nodeList;
    }

    // Question 3: Prepare a method which returns the closest common parent between two nodes. 
    public Node getClosestCommonParent(Node otherNode){

        // Get the list of path nodes in the current node 
        // Example: {14,10,3,11}
        List<Node> A = this.getPathNodes();

        // Get the list of path nodes for the other node
        // Example: {6,3,11}
        List<Node> B = otherNode.getPathNodes();

        // The last common Node. Start by assigning the root node. 
        Node lastCommonNode = this.getRootNode();

        // We see that the closest common parent is the leftmost common node in lists. For example, 3. 
        // Loop by starting at the end of the shortest list and keep checking if the elements at the corresponding index are the same. 
        for(int i = 0; i < Math.min(A.size(),B.size()) ; i++){

            // When i =0, aNode and bNode will be the last elements in the lists.
            Node aNode = A.get(A.size()-1-i);
            Node bNode = B.get(B.size()-1-i);

            // If aNode is the same as bNode, then assign aNode to be the lastCommonNode.
            // Once they stop being equal, the last common node does not get updated and the loop breaks.
            if(aNode.equals(bNode)){
                lastCommonNode = aNode;
            } else {
                break;
            }
        }
        return lastCommonNode; 
    }


}
