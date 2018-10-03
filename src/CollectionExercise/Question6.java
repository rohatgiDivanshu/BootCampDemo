package CollectionExercise;

import java.util.*;


class KeyValueComparator implements Comparator {
    Map map;

    public KeyValueComparator(Map map) {
        this.map = map;
    }

    @Override
    public int compare(Object o, Object t1) {
        Integer i1 = (Integer) map.get(o);
        Integer i2 = (Integer) map.get(t1);
        if (i1 > i2)
            return 1;
        else if (i1 < i2)
            return -1;
        else
            return 1;
    }
}

public class Question6 {

 /*   public static void main(String[] args) {

        int[] arr = {3, 3, 2, 2, 1, 1, 1, 1, 1, 6, 7, 2, 2};
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (!(map.containsKey(arr[i]))) {
                map.put(arr[i], 1);
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println("Before Sorting : ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey());
        }
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        sortedList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> t1, Map.Entry<Integer, Integer> t2) {
                if (t1.getValue() < t2.getValue())
                    return 1;
                else if (t1.getValue() > t2.getValue())
                    return -1;
                else
                    return t2.getKey().compareTo(t1.getKey());
            }
        });
        System.out.println("After sorting : ");
        for (Map.Entry<Integer, Integer> integerEntry : sortedList) {
            System.out.println("Key : " + integerEntry.getKey());
        }
    }
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<>();
        int size;
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        System.out.println("Enter the characters in the array ");
        String[] array = new String[size];
        int val = 0;
        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
            if (map.containsKey(array[i])) {
                val = map.get(array[i]);
                map.put(array[i], ++val);
            } else
                map.put(array[i], 1);
        }
        ArrayList<String> keylist = new ArrayList<>();
        ArrayList<Integer> vallist = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            keylist.add(entry.getKey());
            vallist.add(entry.getValue());
        }
        Comparator c = new KeyValueComparator(map);
        TreeMap<String, Integer> treeMap = new TreeMap(c);
        treeMap.putAll(map);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " has " + entry.getValue() + " value");
        }

        System.out.println(treeMap);


    }

}
