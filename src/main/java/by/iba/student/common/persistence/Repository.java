package by.iba.student.common.persistence;

public interface Repository<T> {

    T create(T t);

    T read(long id);

    T update(T t);

    boolean delete(T t);

}
