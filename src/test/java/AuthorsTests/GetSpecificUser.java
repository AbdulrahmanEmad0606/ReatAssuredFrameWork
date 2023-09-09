package AuthorsTests;

import MainRequests.GetRequest;
import MainRequests.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetSpecificUser {
    GetRequest getSpecificAuthor = new GetRequest(Request.baseUri, "api/v1/Authors/50");
    @Test
    public void checkStatusCodeWhileGettingSpecificAuthor(){
        Assert.assertEquals(getSpecificAuthor.send().statusCode(),200);
        getSpecificAuthor.send().prettyPrint();
    }
    @Test
    public void checkThatAllRequiredDataAreRetrieved(){
        GetAllAuthors getAllAuthors1=new GetAllAuthors();
        getAllAuthors1.CheckTheResponseContainsRequiredData();
    }
}
