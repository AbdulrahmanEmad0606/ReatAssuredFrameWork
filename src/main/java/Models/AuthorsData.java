package Models;

public class AuthorsData {
        public int id;
        public int idBook;
        public String firstName;
        public  String lastName;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getIdBook() {
                return idBook;
        }

        public void setIdBook(int idBook) {
                this.idBook = idBook;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }
}
