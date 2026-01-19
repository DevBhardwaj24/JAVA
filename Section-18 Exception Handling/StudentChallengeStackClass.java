class StackOverFlow extends Exception{
    public String toString(){
        return "Stack is full";
    }
}

class StackUnderFlow extends Exception{
    public String toString(){
        return "Stack is Empty";
    }
}

class Stack{
    private int size;
    private int top=-1;
    private int S[];

    public Stack(int i) {
        // nothing
    }

    public void stack(int sz){
        size=sz;
        S=new int[sz];
    }

    public void push(int x) throws StackOverFlow{
        if(top==size-1)
            throw new StackOverFlow();
        top++;
        S[top]=x;
    }

    public int pop() throws StackUnderFlow{
        int x=-1;
        if(top==-1)
            throw new StackUnderFlow();
        x=S[top];
        top--;
        return x;
        
    }
}

public class StudentChallengeStackClass {
    public static void main(String[] args) throws StackOverFlow, StackUnderFlow {
        Stack st=new Stack(5);

        try {
            st.pop();
        } catch (StackUnderFlow s) {
            System.out.println(s);
        }
        finally{
            st.stack(5);
            st.push(10);
            System.out.println("added the items");
        }
        
    }
}



// In this student challenge u need to define your own exception known as user defined Excpetion