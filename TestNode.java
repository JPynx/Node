// JPSE, 10/2/23, RS with GitHub stuff, No Citations
public class testNode <T> {
    public static void main(String[] args) {
        Node firstNode = new Node(64);
        System.out.println(firstNode.toString());
        Node secondNode = new Node(32);
        System.out.println(secondNode.toString());
        Node allNodesAndValue = new Node(firstNode,secondNode,16);
        System.out.println(allNodesAndValue.toString());

        Object val = firstNode.getValue();
        System.out.println("the variable 'value' is equal to " + val);

        Node parentNode1 = allNodesAndValue.getParentNode();
        System.out.println("The Parent node is " + parentNode1);

        Node childNode1 = allNodesAndValue.getChildNode();
        System.out.println("The child node is " + childNode1);

        Node parentNode2 = new Node(128);

        allNodesAndValue.setParentNode(parentNode2);
        System.out.println(allNodesAndValue.getParentNode().getValue());

        Node childNode2 = new Node(64);
        allNodesAndValue.setChildNode(childNode2);
        System.out.println(allNodesAndValue.getChildNode().getValue());


        System.out.println("True or False: The Node firstNode(64) is the same as childNode2(64) ");
        System.out.println(firstNode.equals(childNode2));

        System.out.println("True or False: The Node firstNode(64) is the same as secondNode(32)");
        System.out.println(firstNode.equals(secondNode));



    }
}
