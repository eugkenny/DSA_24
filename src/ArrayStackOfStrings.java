public class ArrayStackOfStrings implements StackOfStrings{

    String [] stack;
    int top;

    public ArrayStackOfStrings(){
        stack = new String[4];
        top = 0;
    }

    @Override
    public void push(String s) {
        if (top == stack.length){
            resize(stack.length * 2);
        }
        stack[top] = s;
        top++;
    }

    @Override
    public String pop() {
        top--;
        return stack[top];
    }

    @Override
    public String peek() {
        return stack[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    private void resize(int newCapacity){
        String [] newStack = new String[newCapacity];

        for(int i = 0; i < stack.length; i++){
            newStack[i] = stack[i];
        }

        stack = newStack;
    }
}
