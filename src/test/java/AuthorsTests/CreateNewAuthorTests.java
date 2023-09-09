package AuthorsTests;

import MainRequests.PostRequest;
import MainRequests.Request;
import Models.AuthorsData;
import io.restassured.response.Response;
import org.apache.commons.lang3.ObjectUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class CreateNewAuthorTests {
    private PostRequest author = new PostRequest(Request.baseUri, "api/v1/Authors");
    private AuthorsData authorsData = new AuthorsData();

    @Test(priority = 2)
    public void checkAPIStatusCodeWhenSendingValidData() {
        author.setContentType();
        authorsData.setId(50);
        authorsData.setFirstName("55");
        authorsData.setLastName("Mahmoud");
        authorsData.setIdBook(100);
        author.setRequestBody(authorsData);
        Assert.assertEquals(author.createSend().statusCode(), 200, "Invalid status code");
        author.createSend().prettyPrint();
    }

    // Sending invalid data and assert on the status code
    @Test(priority = 3)
    public void checkAPIStatusWhenSendingInvalidData() {
        String body = "{\n" +
                "    \"id\": \"Mohamed\",\n" +
                "    \"idBook\": \"100\",\n" +
                "    \"firstName\": \"20\",\n" +
                "    \"lastName\": 20\n" +
                "}\n";
        author.setContentType();
        author.setRequestBody(body);
        Assert.assertEquals(author.createSend().statusCode(), 400,"Invalid status code");
    }
    // check the behavior while not sending any key
    @Test(priority = 1)
    public void checkMandatoryFields(){
        author.setContentType();
        authorsData.setId(20);
        authorsData.setLastName("Mahmoud");
        authorsData.setIdBook(100);
        author.setRequestBody(authorsData);
        Assert.assertEquals(author.createSend().statusCode(), 200, "Invalid status code");
        Assert.assertEquals(authorsData.getFirstName(), null);
        author.send().prettyPrint();
    }

}
