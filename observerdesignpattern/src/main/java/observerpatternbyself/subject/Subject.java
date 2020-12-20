package observerpatternbyself.subject;

import observerpatternbyself.observer.Observer;

public interface Subject {
    void addObservers(Observer observer);
    void deteleObserver(Observer observer);
    void notifyObservers(Object args);
}
