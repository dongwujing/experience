package com.dw.pattern.observer.question;

public class Test {
    public static void main(String[] args) {
        User u=User.getInstance();
        Teacher d=new Teacher("dwt");
        Teacher c=new Teacher("cct");

        u.addObserver(d);
        u.addObserver(c);

        Question question=new Question();
        question.setContent(" 使用场景");
        question.setName("观察者");

        u.publishQuestion(question);
    }
}
