package _05_class._08_generic;

import java.util.ArrayList;

// 제네릭 클래스
class CustomListGeneric<T> {
    ArrayList<T> list = new ArrayList<>();
    public void addElement(T element) {
        list.add(element);
    }
    public void removeElement(T element) {
        list.remove(element);
    }

    public T get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        return "CustomListGeneric = " + list;
    }
}
public class GenericEx {
    public static void main(String[] args) {
        CustomListGeneric<Integer> genericLi = new CustomListGeneric<>();
        genericLi.addElement(1);
        genericLi.addElement(3);
        genericLi.addElement(6);
        System.out.println(genericLi.toString());

        Integer el = genericLi.get(1);

        CustomListGeneric<Character> genericLi2 = new CustomListGeneric<>();
        genericLi2.addElement('A');
        genericLi2.addElement('B');
        System.out.println(genericLi2.toString());
    }
}