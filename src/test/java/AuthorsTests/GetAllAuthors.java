package AuthorsTests;

import MainRequests.GetRequest;
import MainRequests.Request;
import Models.AuthorsData;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAllAuthors {
        private GetRequest getAllAuthors = new GetRequest(Request.baseUri, "api/v1/Authors");
    private Response response = getAllAuthors.send();
   private AuthorsData[] authorsData = response.as(AuthorsData[].class);

    @Test
    public void testStatusCode() {
        Assert.assertEquals(response.statusCode(), 200);
    }

    @Test
    public void CheckTheResponseContainsRequiredData() {
        Assert.assertFalse(authorsData[0].firstName.equals(null), "First name Key is not provided");
        Assert.assertFalse(authorsData[0].lastName.equals(null), "Last name Key is not provided");
        boolean idValidation = true;
        if (authorsData[0].id != 0) {
            idValidation = true;
        } else idValidation = false;
        Assert.assertEquals(idValidation, true, "Author id Key is not provided");
        boolean bookIdValidation = true;
        if (authorsData[0].idBook != 0) {
            bookIdValidation = true;
        } else bookIdValidation = false;
        Assert.assertEquals(bookIdValidation, true, "bookId Key is not provided");
    }

}
