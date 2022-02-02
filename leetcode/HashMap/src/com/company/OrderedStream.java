package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderedStream {

    int lengthOfStream;

    public OrderedStream(int n) {
        this.lengthOfStream = n;
    }

    public List<String> insert(int idKey, String value) {
        // Map => to store the values
        // then store it a particular index on the list

        Map<Integer , String> map = new HashMap<>();
        map.put(idKey , value);

        List<String> list = new ArrayList<>();
        list.add(idKey , value);


        return  list;

    }

}