package com.company;

//higher module
class NoticesToStudents {
    private StudentInterface student;

    public NoticesToStudents(StudentInterface s) {
        this.student = s;
    }

    public void notice() {
        student.studentInfo("khaja", "received message tomorrow is holiday");
    }
}
