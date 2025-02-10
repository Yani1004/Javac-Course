package LineiniStrOtDanni;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebServer {
    private final List<Request> requests;
    public WebServer() {
        requests = new ArrayList<>();
    }
    public void addRequest(Request req) {
        requests.add(req);
    }
    public void getRequestsStats(){
        Map<Integer,Integer> statusCodes = new HashMap<>();
        for (Request req : requests) {
            int stCode = req.getStatusCode();
            statusCodes.put(stCode, statusCodes.getOrDefault(stCode, 0) + 1);
        }
        System.out.println("Requests stats: ");
        for(Map.Entry<Integer,Integer> entry : statusCodes.entrySet()){
            System.out.println("Code: "+entry.getKey() + " -> Requests " + entry.getValue());
        }

    }



    public static class Request {
        private String url;
        private int statusCode;
        public Request(String url, int statusCode) {
            this.url = url;
            this.statusCode = statusCode;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }
    }
}
