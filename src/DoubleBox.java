public class DoubleBox<T> {
    private RandomBox<T> first;
    private RandomBox<T> second;

    public boolean put(int key, T value) {
        if (first == null) {
            first = new RandomBox<>(key, value);
            return true;
        } else if (second == null) {
            second = new RandomBox<>(key, value);
            return true;
        }
        return false;
    }

    public T get(int key) {
        if (first == null) {
            return null;
        } else if (first.tryUnlock(key) != null) {
            return first.getValue();
        } else if (second == null) {
            return null;
        } else if (second.tryUnlock(key) != null) {
            return second.getValue();
        } else {
            return null;
        }
    }

    public int size() {
        int count = 0;
        if (first != null) {
            count++;
        }
        if (second != null) {
            count++;
        }
        return count;
    }
}