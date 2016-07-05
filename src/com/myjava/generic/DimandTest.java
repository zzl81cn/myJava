package com.myjava.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhouzilong on 2016/7/5.
 */
public class DimandTest {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("SSH");
        strList.add("Crazy Java");
        for(String li: strList){
            System.out.println(li);
        }
        Map<String, List<String>> schoolsInfo = new HashMap<>();
        List<String> schools = new ArrayList<>();
        schools.add("12345");
        schools.add("67890");
        schoolsInfo.put("wukong", schools);
        for(String key: schoolsInfo.keySet()){
            List<String> list = schoolsInfo.get(key);
            System.out.println(key + "-----" + list);
        }
    }
}
