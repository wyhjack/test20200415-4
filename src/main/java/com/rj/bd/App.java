package com.rj.bd;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
public class App
{
    public static void main( String[] args ) throws JsonProcessingException {

        System.out.println( "Hello World!" );
        Map  map=new HashMap();
        map.put("name", "杨过");
        map.put("id", "001");

        ObjectMapper mapper=new ObjectMapper();
        String result = mapper.writeValueAsString(map);
        System.out.println(result);
        System.out.println("再次输出");
    }
}
