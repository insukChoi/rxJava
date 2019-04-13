package com.insuk.ex2;

import rx.Observable;
import rx.functions.Action1;

public class Main {
    public static void main(String[] args) {
        /**
         * Rx Java Hello World
         */
        Observable<String> myObservable = Observable.from(new String[]{"Hello", "World!"});
        myObservable.subscribe(new Action1<String>() {
            public void call(String s) {
                System.out.println(s);
            }
        });

        /**
         * Java 8 람다식으로 표현
         */
        Observable.from(new String[]{"INSUK", "RXJAVA"}).subscribe(System.out::println);
    }
}
