package uff.ic.lleme.tcc00175.aulas.exercicios.calculadora.memento;

public interface Originator {

    public Memento createMemento() throws CloneNotSupportedException;

    public void setMemento(Memento m);
}
