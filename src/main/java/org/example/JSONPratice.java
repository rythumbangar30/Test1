package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONPratice {
    public static void main(String[] args) {


        String jsonString = "{\"menu\": {  \n" +
                "  \"id\": \"file\",  \n" +
                "  \"value\": \"File\",  \n" +
                "  \"popup\": {  \n" +
                "    \"menuitem\": [  \n" +
                "      {\"value\": \"New\", \"onclick\": \"CreateDoc()\"},  \n" +
                "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},  \n" +
                "      {\"value\": \"Save\", \"onclick\": \"SaveDoc()\"}  \n" +
                "    ]  \n" +
                "  }  \n" +
                "}}  ";
        JSONObject obj = new JSONObject(jsonString);
        JSONObject popup = obj.getJSONObject("menu").getJSONObject("popup");
        JSONArray menuItem = popup.getJSONArray("menuitem");
        for(int i=0;i<menuItem.length();i++) {
            String value=menuItem.getJSONObject(i).getString("onclick");
            System.out.println(value);
        }
//        JSONArray arr=obj.getJSONArray("popup");
//        for(int i=0;i<arr.length();i++){
//            String onClick=obj.getJSONObject("menuitem").getString("onclick");
//            System.out.println(onClick);
//        }
    }
}
