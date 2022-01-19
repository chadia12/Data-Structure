package Question1;

import java.util.EmptyStackException;
import java.util.Stack;

public class Symbols <E> implements StackInterface<E> {
    private E[] data;
    private int top = 0;
    private static final int INTIAL_CAPACITY = 10;

    public Symbols() {
        data = (E[]) new Object[INTIAL_CAPACITY];
    }

    @Override
    public E push(E obj) {
        if (top == data.length - 1) {
            // reallocate()
        }
        data[++top] = obj;
        return obj;
    }

    @Override
    public E peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return data[top];
    }

    @Override
    public E pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
            return data[top--];

    }
        @Override
        public boolean empty() {
            return top == -1;
        }

        @Override
        public int getSize() {
            return top + 1;
        }
    }
