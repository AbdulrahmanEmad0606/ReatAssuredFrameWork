package ActivitiesTests;

import MainRequests.GetRequest;
import MainRequests.Request;
import Models.ActivitiesData;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllActivities  {
    GetRequest getAllActivities = new GetRequest(Request.baseUri,"api/v1/Activities");
    Response response = getAllActivities.send();
    @Test
    public void testStatusCode(){
        Assert.assertEquals(response.statusCode(),200);
    }
}
