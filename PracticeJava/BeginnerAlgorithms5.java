// Do it! 자료구조와 함께 배우는 알고리즘 입문 자바편을 직접 푼 코드.
// chapter.04 스택과 큐

import java.util.Scanner;

class IntStack {
    private int max; // 스택 용량
    private int ptr; // 스택 포인터
    private int[] stk; // 스택 본체 (실제로는 본체를 참조하는 배열 변수, 배열 본체는 생성자에서 생성)

    // 실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    // 실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    // 생성자
    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max]; // 배열 생성
        } catch (OutOfMemoryError e) {// 생성 불가
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if (ptr >= max) // 스택이 가득 참
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException { // 정상에 있는 데이터를 들여다봄
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    public int indexOf(int x) { // 스택에서 x를 찾아 인덱스 반환 없으면 -1 반환
        for (int i = ptr - 1; i >= 0; i--)
            if (stk[i] == x)
                return i; // 검색 성공
        return -1;
    }

    public void clear() {
        ptr = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() { // 스택이 비어있는가?
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= max;
    }

    public void dump() { // 스택 안 모든 데이터를 바닥 -> 꼭대기 순서로 출력
        if (ptr <= 0)
            System.out.println("스택이 비어 있음!");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }
}

class Queue<E> {
    private int max; // 큐 용량
    private int num; // 현재 데이터 수
    private E [] que; // 큐 본체


    public Queue(int capacity) {
        num = 0;
        max = capacity;
        try {
            que = (E[]) new Object[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public E enqueue(E x){
        return que[num++] = x;
    }

    public E dequeue() {

        E x = que[0];
        for (int i = 0; i < num - 1; i++)
            que[i] = que[i + 1];
        num --;
        return x;
    }

    public E peek() {
        return que[num - 1];
    }

    public int indexOf(E x) {
        for (int i = num - 1; i >= 0; i--)
            if (que[i] == x)
                return i;
        return -1;
    }

    public void clear() {
        num = 0;
    }

    public int capacity() {
        return max;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비어있음");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[i] + " ");
            System.out.println();
        }
    }
}

class CircleQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public CircleQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) {
        if (num >= max)
            System.out.println("Overflow");
        que[rear++] = x;
        num++;
        if (rear == max)
            rear = 0;
        return x;
    }

    public int deque() {
        if (num <= 0)
            System.out.println("Empty que");
        int x = que[front++];
        num --;
        if (front == max)
            front = max;
        return x;
    }

    public int peek(int x) {
        if (num <= 0)
            System.out.println("Empty que");
        for (int i =0; i < num; i++) {
            int idx = (i + front) % max;
            if (que[idx] == x)
                return idx;
        }
        return -1;
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비어있다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[(i+front) % max] + " ");
            System.out.println();
        }
    }

}

public class BeginnerAlgorithms5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true) {
            System.out.println("현재 데이터 수는 : " + s.size() + "/" + s.capacity());
            System.out.print("(1)Push (2)Pop (3)peek (4)dump (0)Exit : ");

            int menu = stdIn.nextInt();
            if (menu == 0) {
                System.out.println("종료되었습니다.");
                break;
            }

            int x;
            switch (menu) {
                case 1:
                    System.out.println("데이터:");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = s.pop();
                        System.out.println("pop한 데이터는 " + x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.println("peek한 데이터는 " + x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4:
                    s.dump();
                    break;
            }
        }
    }
}
