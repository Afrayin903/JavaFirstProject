package practice8;

interface RepositoryInterface <T> {
    T getById(int id);
    void add (T item);
    void update (T item);
    void delete (int id);
}

