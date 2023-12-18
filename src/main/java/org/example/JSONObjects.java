package org.example;

import org.json.JSONObject;

public class JSONObjects {
    public static void main(String[] args) {
        String jsonString="\n" +
                "{\n" +
                "      \"employee\":{\"name\":\"Sunil\",\"lastName\":\"Joshi\",\"age\":22,\"married\":false},\n" +
                "      \"secondEmployee\":{\"name\":\"Ram\",\"lastName\":\"Nigam\",\"age\":23,\"married\":true}\n" +
                "}";
        JSONObject obj=new JSONObject(jsonString);
    String lastName=obj.getJSONObject("employee").getString("lastName");
    Integer age=obj.getJSONObject("employee").getInt("age");
        System.out.println(lastName);
        System.out.println(age);
    }
}
