package com.oman.drawable;

import io.reactivex.Flowable;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello");
        Flowable.just("hello world").subscribe(System.out::println);
    }
}
