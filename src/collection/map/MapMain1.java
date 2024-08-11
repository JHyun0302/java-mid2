package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentsMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentsMap.put("studentA", 90);
        studentsMap.put("studentB", 80);
        studentsMap.put("studentC", 80);
        studentsMap.put("studentD", 100);
        System.out.println(studentsMap);

        //특정 학생의 값 조회
        Integer result = studentsMap.get("studentD");
        System.out.println("result = " + result);

        System.out.println("keySet 활용");
        Set<String> keySet = studentsMap.keySet(); //중복 X, 순서 보장 X
        for (String key : keySet) {
            Integer value = studentsMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("entrySet 활용");
        Set<Entry<String, Integer>> entries = studentsMap.entrySet();
        for (Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("values 활용");
        Collection<Integer> values = studentsMap.values(); //중복 O, 순서 보장 X
        for (Integer value : values) {
            System.out.println("value = " + value);
        }


    }
}
