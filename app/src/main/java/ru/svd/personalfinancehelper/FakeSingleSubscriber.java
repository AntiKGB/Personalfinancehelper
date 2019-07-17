package ru.svd.personalfinancehelper;

import rx.Subscriber;

public abstract class FakeSingleSubscriber<T> extends Subscriber<T> {
    private T res;

    final public void onCompleted() { onSuccess(res);}

    final public void onNext(T t) {this.res = t;}

    abstract public void onSuccess(T t);

}
