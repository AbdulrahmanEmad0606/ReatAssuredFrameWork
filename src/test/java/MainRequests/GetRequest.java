package MainRequests;

public class GetRequest extends Request{
    public GetRequest(String baseUri, String endPoint) {
        super(endPoint);
    }
    public void setQueryParameter(String queryParameter,String value){
        requestSpecification.param(queryParameter,value);
    }
}
