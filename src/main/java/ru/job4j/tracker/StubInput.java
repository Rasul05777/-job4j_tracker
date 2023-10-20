package ru.job4j.tracker;

import java.util.List;

public class StubInput implements Input {
    private int position = 0;
    private List<String> answers;

    public StubInput(String[] answers) {
        this.answers = List.of(answers);
    }

    @Override
    public String  askStr(String question) {
        return answers.get(position++);
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
