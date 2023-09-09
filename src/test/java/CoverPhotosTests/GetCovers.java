package CoverPhotosTests;

import MainRequests.GetRequest;
import MainRequests.Request;
import org.testng.annotations.Test;

public class GetCovers {
    GetRequest getAllActivities = new GetRequest(Request.baseUri,"/api/v1/CoverPhotos");
    @Test
    public void testStatusCode(){
        getAllActivities.send().prettyPrint();
    }
}
