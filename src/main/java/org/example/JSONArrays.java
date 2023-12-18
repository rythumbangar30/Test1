package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONArrays {
    public static void main(String[] args) {
        String jsonString="{\"employees\":[  \n" +
                "    {\"name\":\"Shyam\", \"email\":\"shyamjaiswal@gmail.com\"},  \n" +
                "    {\"name\":\"Bob\", \"email\":\"bob32@gmail.com\"},  \n" +
                "    {\"name\":\"Jai\", \"email\":\"jai87@gmail.com\"}  \n" +
                "]}  ";

        JSONObject obj=new JSONObject(jsonString);
       // String name=obj.getJSONObject("employees").getString("name");
        JSONArray arr=obj.getJSONArray("employees");
//        for(int i=0;i< arr.length();i++){
//            String name=arr.getJSONObject(i).getString("email");
//            System.out.println(name);
//        }
        String name=arr.getJSONObject(1).getString("email");
        System.out.println(name);

    }
}
