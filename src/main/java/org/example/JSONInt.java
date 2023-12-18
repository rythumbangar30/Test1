package org.example;

import org.json.JSONObject;

public class JSONInt {
    public static void main(String[] args) {
        String jsonString="{  \n" +
                "\"integer\": 34,  \n" +
                "\"fraction\": .2145,  \n" +
                "\"exponent\": 6.61789e+0 , \n" +
                "\"first\": true,  \n" +
                "\"second\": false  }  ";
        JSONObject obj=new JSONObject(jsonString);
        Integer Tip=obj.getInt("integer");
        System.out.println(Tip);
        Float flop=obj.getFloat("fraction");
        Double deep=obj.getDouble("exponent");
        Boolean bip=obj.getBoolean("second");
        System.out.println(flop+" "+deep+" "+bip);

    }
}
