package com.zld.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Date;

public class JacksonTest {
    public static void main(String[] args) throws IOException {

        Person p = new Person("张三", 15, "男", new Date());

        ObjectMapper mapper = new ObjectMapper();
        //将Java对象转换为String
        String s = mapper.writeValueAsString(p);

        System.out.println(s);

        //将String转换为Java对象
        Person person = mapper.readValue(s, Person.class);
        System.out.println(person);

    }
}
