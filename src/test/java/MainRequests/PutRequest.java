package MainRequests;

import io.restassured.http.ContentType;

public class PutRequest extends Request{
    public PutRequest(String baseURI,String endPoint) {
        super(endPoint);
    }
    public void setContentType(){
        requestSpecification.contentType(ContentType.JSON);
    }
    public void setRequestBody(Object requestBody){
        requestSpecification.body(requestBody);
    }
}
