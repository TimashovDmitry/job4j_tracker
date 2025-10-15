package ru.job4j.queue;


import java.util.Deque;

public class ReconstructPhrase {
    private  Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Character string : evenElements) {
            if (i % 2 == 0) { // остаток от деления %
                sb.append(string);
            }
            i++;
        }
        return sb.toString();
    }

    private String getDescendingElements() {
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = descendingElements.size();
        for (Character string : evenElements) {
            if (a < b) {
                Character str = descendingElements.pollLast();
                sb.append(str);
                a++;
            }
        }

        return sb.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
