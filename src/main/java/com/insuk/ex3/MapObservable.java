package com.insuk.ex3;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

public class MapObservable {
    public static void main(String[] args) {
        Observable.from(new String[]{"Hello","world!"})
                .map(new Func1<String, Integer>() {
                    @Override
                    public Integer call(String s) {
                        return s.length();
                    }
                })
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer i) {
                        System.out.println(i);
                    }
                });
    }

}
