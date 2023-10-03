public class Node <T> {
    private Node parentNode;
    private Node childNode;
    private T value;

    public Node (){
    }

    public Node (T numVal){
        value = numVal;
    }
    public Node (Node pNode, Node cNode, T numVal){
        parentNode = pNode;
        childNode = cNode;
        value = numVal;
    }

    public T getValue(){
        return value;
    }

    public Node getParentNode(){
        return parentNode;
    }

    public Node getChildNode(){
        return childNode;
    }

    public void setValue(T numVal){
        value = numVal;
    }

    public void setParentNode(Node pNode){
        parentNode = pNode;
    }

    public void setChildNode(Node cNode){
        childNode = cNode;
    }

    public boolean equals(Node inputNode){
        if (inputNode.getValue() == value){
            return true;
        }
        else {
            return false;
        }
    }

    public String toString(){
        return "Node: " + value;
    }

}

