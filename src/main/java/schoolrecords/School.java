package schoolrecords;

import java.nio.file.Path;
import java.util.List;

public class School {

    private List<Subject> subjects;

    private List<Tutor> tutors;

    public void loadFromFile(Path path) {
        // TODO
    }

    public Tutor findTutorByName(String tutorName) {
        for (Tutor tutor : tutors) {
            if (tutorName.equals(tutor.getName())) {
                return tutor;
            }
        }
        throw new IllegalArgumentException("Cant find tutor with this name!");
    }

    public Subject findSubjectByName(String subjectName) {
        for (Subject subject : subjects) {
            if (subjectName.equals(subject.getSubjectName())) {
                return subject;
            }
        }
        throw new IllegalArgumentException("Cant find subject with this name!");
    }

}
