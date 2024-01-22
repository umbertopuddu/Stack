public class Stack<T> {
    
    Node top;
    
    protected class Node{
        protected T data;
        protected Node previous;
        
        protected Node(T data, Node previous){
            this.data = data;
            this.previous = previous;
        }
        
        protected Node(T data){
            this.data = data;
            this.previous = null;
        }
        
        protected T getData(){
            return data;
        }
        
        protected Node getPrevious(){
            return previous;
        }
    }
    
    public void push(T toAdd){
        if(top == null){
            top = new Node(toAdd);
        }
        else{
            top = new Node(toAdd, top);
        }
    }
    
    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }
    
    public T peek(){
        if(top != null){
            return top.getData();    
        }
        return null;
    }
    
    public T pop(){
        T data = this.peek();
        top = top.getPrevious();
        return data;
    }
    
    public Stack(T... data){
        this();
        for(T node : data){
            this.push(node);
        }
    }
    
    public Stack(){
        this.top = null;
    }
    
}