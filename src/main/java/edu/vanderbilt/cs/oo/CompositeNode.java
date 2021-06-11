package edu.vanderbilt.cs.oo;

public class CompositeNode implements Node {

    private Node leftChild = new NullNode();

    private Node rightChild = new NullNode();

    private Node parent;

    private Double value;

    public CompositeNode(Double value) {
        this.value = value;
        this.leftChild.setParent(this);
        this.rightChild.setParent(this);
    }


    @Override
    public Double sum(){
        return this.rightChild.sum() + this.leftChild.sum() + this.value;
    }

    @Override
    public Double average(){
        return this.sum() / this.size();
    }


    @Override
    public int size(){
        return this.rightChild.size() + this.leftChild.size() + 1;
    }


    @Override
    public void insert(Double d){
        if(d > this.value){
            this.rightChild.insert(d);
            this.rightChild.setParent(this);
        } else {
            this.leftChild.insert(d);
            this.leftChild.setParent(this);
        }
    }

    @Override
    public boolean contains(Double value){
        if(this.value.equals(value)) return true;
        if(value < this.value){
            if(this.leftChild.getLeftChild() == null) {
                return false;
            }
            return this.leftChild.contains(value);
        }
        else {
            if(this.rightChild.getRightChild() == null){
                return false;
            }
            return this.rightChild.contains(value);
        }
    }

    @Override
    public void setValue(Double d){
        this.value = d;
    }

    @Override
    public Double getValue(){
        return this.value;
    }

    @Override
    public void setParent(Node n){
        this.parent = n;
    }

    @Override
    public Node getParent(){
        return this.parent;
    }

    @Override
    public void replace(Node child, Node replacement){
        if (child == this.leftChild){
            this.leftChild = replacement;
            this.leftChild.setParent(this);
        }

        if (child == this.rightChild){
            this.rightChild = replacement;
            this.rightChild.setParent(this);
        }
    }

    @Override
    public Node getLeftChild(){
        return this.leftChild;
    }

    @Override
    public Node getRightChild(){
        return this.rightChild;
    }


}