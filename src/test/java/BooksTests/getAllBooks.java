package BooksTests;

import MainRequests.GetRequest;
import MainRequests.Request;
import org.testng.annotations.Test;

public class getAllBooks {
    GetRequest getAllActivities = new GetRequest(Request.baseUri,"api/v1/Books");
    @Test
    public void testStatusCode(){
        getAllActivities.send().prettyPrint();
    }
}
