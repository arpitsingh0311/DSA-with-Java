package M13_Arrays;

import java.util.ArrayList;

public class arr_list {
    public static void main(String[] args) {
        ArrayList<Integer> arrlt = new ArrayList<>(6);
        arrlt.add(0,10);
        arrlt.add(1,20);
        arrlt.add(2,30);
        arrlt.add(3,40);
        arrlt.add(4,50);
        arrlt.add(5,60);
        System.out.println(arrlt);
        for(int i=0;i<arrlt.size();i++){
            System.out.print(arrlt.get(i)+ ", ");
        }
        System.out.println();
        arrlt.add(6,70);
        arrlt.set(2,300);
        System.out.println(arrlt);


    }
}
