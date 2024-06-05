import java.util.Arrays;

public class CircularBuffer<T> {

    private int pointer;

    private final int size;
    private int oldest;

    private int usedCells;

    private final Object[] array;

    public CircularBuffer(final int size) {
        this.array = new Object[size];
        this.size = size;
        this.pointer = -1;
        this.oldest = -1;
        this.usedCells = 0;
    }

    public T read() throws BufferIOException {
        if (this.usedCells == 0) {
            throw new BufferIOException("Tried to read from empty buffer");
        }

        T value = (T) this.array[this.oldest];

        this.array[this.oldest] = null;
        this.oldest = adjustPointer(++this.oldest);
        this.usedCells--;

        return value;
    }

    public void write(T data) throws BufferIOException {
        // Test whether is full.
        if (this.usedCells == this.size) {
            throw new BufferIOException("Tried to write to full buffer");
        } else {
            this.pointer = adjustPointer(++this.pointer);

            this.array[pointer] = data;

            if (this.oldest == -1) {
                this.oldest = this.pointer;
            }
            this.usedCells++;
        }
    }

    public void overwrite(T data) throws BufferIOException {
        if (this.usedCells == this.size) {
            this.array[this.oldest] = data;
            this.oldest = adjustPointer(++this.oldest);
        } else {
            this.write(data);
        }
    }

    public void clear() {
        Arrays.fill(this.array, null);
        this.pointer = -1;
        this.oldest = -1;
        this.usedCells = 0;
    }

    private int adjustPointer(int pointer) {
        return pointer % this.size;
    }
}