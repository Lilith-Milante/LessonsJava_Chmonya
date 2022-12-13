package OOP_Homework5.util;


import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import OOP_Homework5.data.Contact;
import OOP_Homework5.data.Phonebook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteToJSON {

    public JSONArray createJsonArray(Phonebook pb) { // создание джейсон эррея
            JSONArray resultArray = new JSONArray();
            ArrayList<Contact> contactsList = pb.getContacts();
            for (Contact i : contactsList) {
                resultArray.add(createJsonObject(i));
            }
            return resultArray;
        }

    public void writeJson(JSONArray jsonArray, String pathFile){ // запись в объект джейсон эррея
        try (PrintWriter out = new PrintWriter(new FileWriter(pathFile))) {
            for (Object i : jsonArray){
                out.write(i.toString()+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public JSONObject createJsonObject(Contact contact){ // создание джейсон объекта
        JSONObject resultObject = new JSONObject();
        resultObject.put("firstName",contact.getUser().getFirstName());
        resultObject.put("lastName",contact.getUser().getLastName());
        resultObject.put("company",contact.getUser().getCompany());
        resultObject.put("Phones",contact.getPhones());
        return resultObject;
    }
}
