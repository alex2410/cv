package ru.trushkin.cv.tasks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidateBrackets {

    public boolean validate(String text) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '{':
                case '[':
                case '(':
                    deque.push(text.charAt(i));
                    break;
                case ']':
                    Character poll = deque.poll();
                    if (poll == null || !poll.equals('[')) {
                        return false;
                    }
                    break;
                case '}':
                    Character poll2 = deque.poll();
                    if (poll2 == null || !poll2.equals('{')) {
                        return false;
                    }
                    break;
                case ')':
                    Character poll3 = deque.poll();
                    if (poll3 == null || !poll3.equals('(')) {
                        return false;
                    }
                    break;
            }
        }
        return deque.isEmpty();
    }
}
