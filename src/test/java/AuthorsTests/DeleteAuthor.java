package AuthorsTests;

import MainRequests.DeleteRequest;
import MainRequests.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteAuthor {
    //for invalid id => 8888888888
    DeleteRequest deleteRequest = new DeleteRequest(Request.baseUri, "api/v1/Authors/50");

    @Test
    public void checkStatusCodeAfterDeletingUser() {
        boolean success = true;
        if (deleteRequest.deleteSend().getStatusCode() == 200) {
            success = true;
            Assert.assertTrue(success, "Status code is not 200");
            deleteRequest.confirmDeleting();
        } else {
            success = false;

            Assert.assertFalse(success, "Status code is not 200");
        }
    }
}
