package OOP_Homework4.Planner.util;

import OOP_Homework4.Planner.data.Components;
import OOP_Homework4.Planner.service.PlannerService;

import java.io.PrintWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteToJSON {
     public void writeJson(JSONArray jsonArray, String pathFile) {
         try (PrintWriter out = new PrintWriter(new FileWriter(pathFile))) {
             for (Object i : jsonArray) {
                 out.write(i.toString() + "\n");
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
     }

     public JSONArray createJsonArray(PlannerService ps) {
         JSONArray resultArray = new JSONArray();
         for (Components i : ps.tasksList){
             resultArray.add(createJsonObject(i));
         }
         return resultArray;
     }

    public JSONObject createJsonObject(Components comp){
        JSONObject resultObject = new JSONObject();
        resultObject.put("id",comp.getId());
        resultObject.put("createDate",comp.getCreateDate().toString());
        resultObject.put("createTime",comp.getCreateTime().toString());
        resultObject.put("deadline",comp.getDeadLine().toString());
        resultObject.put("nameAutorr",comp.getNameAutor());
        resultObject.put("priority",String.valueOf(comp.getPriority()));
        return resultObject;
    }
}
