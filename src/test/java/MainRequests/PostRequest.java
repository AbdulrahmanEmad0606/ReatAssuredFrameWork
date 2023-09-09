package MainRequests;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PostRequest extends Request{
    public PostRequest(String baseURI,String endPoint) {
        super(endPoint);
    }
    public void setContentType(){
        requestSpecification.contentType(ContentType.JSON);
    }
    public void setRequestBody(Object requestBody){
        requestSpecification.body(requestBody);
    }
}
