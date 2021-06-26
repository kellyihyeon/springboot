package com.dev.blog.test;

public class TestApp {

    public static void main(String[] args) {
        People marcelline = new People();
        // 다른 클래스에서는 .으로 private 멤버 변수에 바로 접근을 못함
        marcelline.eat();
    }
}
