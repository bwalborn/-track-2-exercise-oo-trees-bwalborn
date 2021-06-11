package edu.vanderbilt.cs.oo;

public class NullNode implements Node {

    private Node parent;


    @Override
    public Double sum(){
        return 0.0;
    }

    @Override
    public Double average(){
        return 0.0;
    }

    @Override
    public int size(){
        return 0;
    }

    @Override
    public Node getLeftChild(){
        return null;
    }

    @Override
    public Node getRightChild(){
        return null;
    }
    
    @Override
    public Double getValue(){
        return 0.0;
    }

    @Override
    public Node getParent(){
        return parent;
    }


    @Override
    public void insert(Double d) {
        CompositeNode NodeToInsert = new CompositeNode(d);
        this.getParent().replace(this, NodeToInsert);
    }

    @Override
    public boolean contains(Double value) {
        return false;
    }

    @Override
    public void setValue(Double d) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setParent(Node parent) {
        this.parent = parent;
        
    }

    @Override
    public void replace(Node child, Node replacement) {}
}