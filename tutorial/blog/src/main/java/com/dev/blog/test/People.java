package com.dev.blog.test;

public class People {

    private int hungryState = 50;

    public void eat() {
        hungryState += 10;
    }

    public static void main(String[] args) {
        People people = new People();

        // 변수에 바로 접근해서 수정 => 객체 지향적이지 않다.
        people.hungryState = 100;
        System.out.println("people.hungryState = " + people.hungryState);
        people.eat();
        System.out.println("people.hungryState = " + people.hungryState);

        // ? private 으로 변수를 선언해도 .으로 접근은 가능
    }
}
