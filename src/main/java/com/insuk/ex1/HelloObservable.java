package com.insuk.ex1;

import rx.Observable;
import rx.Subscriber;

public class HelloObservable {
    public static void main(String[] args) {
        // Observable 정의
        Observable<String> myObservable = Observable.create(
                new Observable.OnSubscribe<String>() {
                    @Override
                    public void call(Subscriber<? super String> subscriber) {
                        subscriber.onNext("Hello, world!");
                        subscriber.onNext("~~~");
                        subscriber.onCompleted();
                    }
                }
        );

        // 옵저버 정의
        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onNext(String s) {
                System.out.println(s);
            }

            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }
        };

        // 옵저버가 Observable 을 구독한다.
         myObservable.subscribe(mySubscriber);

    }


}
