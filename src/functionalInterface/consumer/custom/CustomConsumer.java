package functionalInterface.consumer.custom;


@FunctionalInterface
public interface CustomConsumer<T> {

    void accept(T t);

    default CustomConsumer<T> andThen(CustomConsumer<T> after) { // This first consumes current value then after value
        return (T t) -> {
            this.accept(t);
            after.accept(t);
        };
    }
}
