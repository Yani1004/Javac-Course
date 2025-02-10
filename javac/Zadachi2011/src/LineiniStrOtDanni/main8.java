package LineiniStrOtDanni;
public class main8 {
    public static void main(String[] args) {
        WebServer server = new WebServer();
        server.addRequest(new WebServer.Request("/home", 200));
        server.addRequest(new WebServer.Request("/about", 200));
        server.addRequest(new WebServer.Request("/contact", 404));
        server.getRequestsStats();
    }
}
