package com.company;

//higher module
class NoticesToStudents {
    private Student student;

    public NoticesToStudents(Student s) {
        this.student = s;
    }

    public void notice() {
        student.studentInfo("khaja", "received message tomorrow is holiday");
    }
}
