
//https://serpapi.com/search.json?engine=google_maps&q=pizza&ll=@40.7455096,-74.0083012,15.1z&type=search
import java.util.HashMap;
import java.util.Map;
import com.google.gson.JsonObject;
import com.serpapi.GoogleSearch;
import com.serpapi.SerpApiSearchException;

public class Maincode{
    public static void main(String[] args){
        //System.out.println("hello world!");
        
        Map<String, String> parameter = new HashMap<>();

        parameter.put("engine", "google_maps");
        parameter.put("q", "pizza");
        parameter.put("ll", "@40.7455096,-74.0083012,15.1z");
        parameter.put("type", "search");
        parameter.put("api_key", "secret_api_key");

        GoogleSearch search = new GoogleSearch(parameter);

        try {
          JsonObject results = search.getJson();
          var local_results = results.get("local_results");
        } catch (SerpApiSearchException ex) {
          System.out.println("Exception:");
          System.out.println(ex.toString());
        }   
    }
}