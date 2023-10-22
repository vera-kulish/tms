package Homework11;

//Представим, что в Java нет коллекции типа ArrayList.
//Создать свой класс, симулирующий работу класса динамической коллекции -
// т.е. создать свою кастомную коллекцию. В основе коллекции будет массив.
// Кастомная коллекция должна хранить элементы разных классов(т.е. это generic).
//Предусмотреть операции добавления элемента, удаления элемента, получение элемента по индексу, проверка есть ли элемент в коллекции,
// метод очистки все коллекции.
//Предусмотреть конструктор без параметров - создает массив размером по умолчанию.
//Предусмотреть конструктор с задаваемым размером внутреннего массива.
//Предусмотреть возможность автоматического расширения коллекции при добавлении элемента в том случае, когда коллекция уже заполнена.

public class CustomArrayList {

    Object[] array;

    //create a collection with 1 item by default
    CustomArrayList() {
        this.array = new Object[0];
    }

    //create a collection with empty objects with specified size
    CustomArrayList(int size) {
        this.array = new Object[size];
    }

    //create a collection from specified items
    CustomArrayList(Object... array) {
        this.array = new Object[array.length];
        for(int i = 0; i < array.length; i++)
            this.array[i] = array[i];
    }

    //get the object by index
    public Object get(int index) {
        if(index < 0 || index >= array.length) {
            throw new ObjectNotFoundException("No such object in the collection");
        }
        return array[index];
    }

    //get collection length
    public int length() {
        return array.length;
    }

    //add new object to the end of the collection
    public void add(Object object) {
        Object[] newArray = new Object[array.length + 1];
        for(int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        newArray[array.length] = object;

        array = newArray;
    }

    //remove the specified object from the collection
    public void remove(Object object) {
        int newArrayLength = array.length;
        for(Object o : array)
            if(o.equals(object))
                newArrayLength--;

        //if specified object is not present in the collection = throw an exception
        if(newArrayLength == array.length) {
            throw new ObjectNotFoundException("No such object in the collection");
        }

        //copy the array, skipping the specified object
        Object[] newArray = new Object[newArrayLength];
        int i = 0; // index for the new array

        // copy the array skipping the object that needs to be deleted
        for(Object o : array) {
            if (!o.equals(object)) {
                newArray[i] = o;
                i++;
            }
        }

        array = newArray;
    }

    //remove the object with specified index from the collection
    public void remove(int index) {
        if(index < 0 || index >= array.length) {
            throw new ObjectNotFoundException("No object with this index in the collection");
        }

        //copy the array, skipping the specified object
        Object[] newArray = new Object[array.length - 1];
        int i = 0;
        int j = 0;

        // copy the array skipping the object that needs to be deleted
        for(Object o : array) {
            if (i != index) {
                newArray[j] = o;
                j++;
            }
            i++;
        }

        array = newArray;
    }

    //check if the collection contains specified object
    public boolean contains(Object object) {
        for(Object o : array)
            if(o.equals(object))
                return true;
        return false;
    }

    //clear the collection
    public void clear() {
        for(Object o : array)
            o = null;
    }

}
