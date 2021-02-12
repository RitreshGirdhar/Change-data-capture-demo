package learning.personal.cdc.demo.transformer;

public abstract class Transformer<T, R> {
    public abstract R transform(T t);
}
