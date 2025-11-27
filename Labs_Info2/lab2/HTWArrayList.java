//19.11.2025 - Info2
public class HTWArrayList<E> {

    private int capacity = 10;

    private int size = 0;

    private E[] data = (E[])(new Object[capacity]);

    public void add(E elem){
        if (size < capacity){
        data[size] = elem;
        size += 1;
        } else if(size == capacity){
            //Usually Java uses *2 instead of +1 so the array doesn't have to go through the process when the list is gradually growing
            E[] longerData = (E[])(new Object[capacity+1]);
            System.arraycopy(data,0, longerData, 0, size);
            capacity += 1;
            data = longerData;
        }
    }

    public E get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index);
        }
        return data[index];
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index);
        }
        for(int i = data.length; i > index; i-- ){
            data[index] = data[index+1];
            index++;
        }
        size --;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void set(int index, E value){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index);
        }
        data[index] = value;
    }

    public static void main(String[] args) {
        HTWArrayList<String> people = new HTWArrayList<>();
        people.add("Anton");
        people.add("Isaak");
        people.add("Ashley");

        HTWArrayList<Double> grades = new HTWArrayList<>();
        grades.add(1.3);
        grades.add(2.0);
        

    }
}
