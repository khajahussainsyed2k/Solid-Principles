package com.company;


//dependency inversion


public class FollowingSolidPrinciples{
    public static void main(String args[]) {
        NoticesToStudents noticeToStudents=new NoticesToStudents(new Student());
        noticeToStudents.notice();

    }
}