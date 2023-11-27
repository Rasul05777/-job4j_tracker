package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double score = 0.0;
        int subjects = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subject()) {
                    score += subject.core();
                    subjects++;
            }
        }
        return score / subjects;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> averageScores = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0.0;
            int subjects = pupil.subject().size();
            for (Subject subject : pupil.subject()) {
                score += subject.core();
            }
            double allScore = score / subjects;
            averageScores.add(new Label(pupil.name(), allScore));
        }
        return averageScores;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subject()) {
                temp.put(subject.name(), temp.getOrDefault(subject.name(), 0) + subject.core());
            }
        }
        List<Label> labels = new ArrayList<>();
        for (String key : temp.keySet()) {
            labels.add(new Label(key, (double) temp.get(key) / pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
       List<Label> averagePeople = new ArrayList<>();
       for (Pupil pupil : pupils) {
           double score = 0.0;
           for (Subject subject : pupil.subject()) {
               score += subject.core();
           }
           averagePeople.add(new Label(pupil.name(), score));
       }
        averagePeople.sort(Comparator.naturalOrder());
        Label bestSt = averagePeople.get(averagePeople.size() - 1);
        return bestSt;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> temp = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subject()) {
                temp.put(subject.name(), temp.getOrDefault(subject.name(), 0) + subject.core());
            }
        }
        List<Label> labels = new ArrayList<>();
        for (String key : temp.keySet()) {
            labels.add(new Label(key, temp.get(key)));
        }
        labels.sort(Comparator.naturalOrder());
        Label bestSb = labels.get(labels.size() - 1);
        return bestSb;
    }
}