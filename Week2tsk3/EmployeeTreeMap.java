package Week2tsk3
;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(Map.of(
                101, "afiya shaikh",
                104, "yusuf shaukh",
                102, "nowman shaikh",
                105, "anas inamdar",
                103, "Salman Khan"
        ));

        System.out.println("\nEmp ID : Emp Name");
        for (Map.Entry<Integer, String> mapObj : map.entrySet()) {
            System.out.println(mapObj.getKey() + " :\t" + mapObj.getValue());
        }
    }
}
