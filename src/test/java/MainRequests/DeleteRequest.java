package MainRequests;

public class DeleteRequest extends Request{
    public DeleteRequest(String baseUri,String endPoint) {
        super(endPoint);
    }
    public void confirmDeleting(){
        System.out.println("Deleted");
    }
}
