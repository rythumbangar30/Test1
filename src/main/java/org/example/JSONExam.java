package org.example;

import org.json.JSONObject;

public class JSONExam {
    public static void main(String[] args) {
        String jsonString="{\n" +
                "  \"firstName\": \"Sonoo\",\n" +
                "  \"lastName\": \"Jaiswal\",\n" +
                "  \"age\": 27,\n" +
                "  \"address\": {\n" +
                "    \"streetAddress\": \"Plot-6, Mohan Nagar\",\n" +
                "    \"city\": \"Ghaziabad\",\n" +
                "    \"state\": \"UP\",\n" +
                "    \"postalCode\": \"201007\"\n" +
                "  }\n" +
                "}";
        JSONObject obj=new JSONObject(jsonString);
        String streetAddress=obj.getJSONObject("address").getString("city");
        System.out.println(streetAddress);
    }
}
