package Project2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class ModalStack {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            queue.add(i);
            System.out.println(i);
        }
        if (queue.size() >= 5) {
            System.out.println("Queue is full");
        }
        while (!queue.isEmpty()) {
            int removed = queue.poll();
            System.out.println(removed);
        }
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        }
    }
}