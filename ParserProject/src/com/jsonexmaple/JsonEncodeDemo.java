package com.jsonexmaple;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

class JsonEncodeDemo {

   public static void main(String[] args){
      JSONObject obj = new JSONObject();

      obj.put("name", "foo");
      obj.put("num", new Integer(100));
      obj.put("balance", new Double(1000.21));
      obj.put("is_vip", new Boolean(true));

      System.out.print(obj);
      System.out.println("");
      
      StringWriter out = new StringWriter();
      try {
		obj.writeJSONString(out);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      String jsonText = out.toString();
      System.out.print(jsonText);
   }
}
