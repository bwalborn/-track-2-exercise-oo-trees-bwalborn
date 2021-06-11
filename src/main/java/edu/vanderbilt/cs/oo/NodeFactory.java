package edu.vanderbilt.cs.oo;

public class NodeFactory {

    public Node newNode(Double v){
        return newCompositeNode(v);
    }

    public Node newCompositeNode(Double v){
        return new CompositeNode(v);
    }

    public Node newNullNode(){
        return new NullNode();
    }


}
