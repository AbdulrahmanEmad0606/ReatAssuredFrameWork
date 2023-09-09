package AuthorsTests;

import MainRequests.PutRequest;
import MainRequests.Request;
import Models.AuthorsData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditAuthor {
    private PutRequest author = new PutRequest(Request.baseUri,"api/v1/Authors/50");
    private AuthorsData authorsData = new AuthorsData();
    @Test
    public void editAuthor(){
        author.setContentType();
        authorsData.setId(50);
        authorsData.setFirstName("55");
        authorsData.setLastName("Mahmoud");
        authorsData.setIdBook(100);
        author.setRequestBody(authorsData);
        Assert.assertEquals(author.putSend().statusCode(), 200, "Invalid status code");

    }
}
