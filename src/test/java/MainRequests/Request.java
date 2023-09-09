package MainRequests;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Request {
    public static String baseUri = "https://fakerestapi.azurewebsites.net";
    protected String endPoint;
   protected RequestSpecification requestSpecification;

    public Request(String endPoint) {
        this.endPoint = endPoint;
        requestSpecification = given().baseUri(baseUri).basePath(endPoint);
    }
    public void setHeader(String header,String value){
        requestSpecification.header(header,value);
    }
    // get the response
    public Response send(){
        return requestSpecification.get();
    }
    public Response createSend(){
        return requestSpecification.post();
    }
    public Response putSend(){
        return requestSpecification.put();
    }
    public Response deleteSend(){
        return requestSpecification.delete();
    }
}
