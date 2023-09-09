package UsersTests;

import MainRequests.GetRequest;
import MainRequests.Request;
import org.testng.annotations.Test;

public class GetUsers {
    GetRequest getAllActivities = new GetRequest(Request.baseUri,"/api/v1/Users");
    @Test
    public void testStatusCode(){
        getAllActivities.send().prettyPrint();
    }
}
