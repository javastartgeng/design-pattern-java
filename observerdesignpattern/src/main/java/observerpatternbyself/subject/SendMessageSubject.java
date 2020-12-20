package observerpatternbyself.subject;

import observerpatternbyself.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class SendMessageSubject implements Subject{
    /**
     * 观察者注册中心
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     * @param observer 观察者
     */
    @Override
    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     * @param observer 观察者
     */
    @Override
    public void deteleObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     * @param args
     */
    @Override
    public void notifyObservers(Object args) {
        for(Observer observer : observers){
            observer.update(args);
        }
    }
}
