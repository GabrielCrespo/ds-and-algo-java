package datastructures.dynamicarray;

public class DynamicArrayTest {
    public static void main(String[] args) {

        DynamicArray<Integer> array = new DynamicArray<>(4);

        System.out.println("Array is empty " + array.isEmpty());

        array.push(1);
        array.push(2);
        array.push(3);
        array.push(4);

        System.out.println("Array is empty " + array.isEmpty());
        System.out.println();

        System.out.println("Array = " + array);
        System.out.println("Size = " + array.getSize());
        System.out.println("Capacity = " + array.getCapacity());
        System.out.println();

        array.push(5);

        System.out.println("Array = " + array);
        System.out.println("Size = " + array.getSize());
        System.out.println("Capacity = " + array.getCapacity());
        System.out.println();

        //array.delete(1);
        Integer a = array.pop();

        System.out.println("Pop = " + a);
        System.out.println("Array = " + array);
        System.out.println("Size = " + array.getSize());
        System.out.println("Capacity = " + array.getCapacity());
        System.out.println();

        array.delete(1);

        System.out.println("Array = " + array);
        System.out.println("Size = " + array.getSize());
        System.out.println("Capacity = " + array.getCapacity());
        System.out.println();

        array.insert(0, 8);

        System.out.println("Array = " + array);
        System.out.println("Size = " + array.getSize());
        System.out.println("Capacity = " + array.getCapacity());
        System.out.println();

        System.out.println(array.get(3));

        array.set(3, 123);
        System.out.println("Array = " + array);

        System.out.println(array.find(3));
        System.out.println(array.find(1000));



    }
}
