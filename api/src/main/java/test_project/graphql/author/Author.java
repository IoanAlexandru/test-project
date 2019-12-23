package test_project.graphql.author;

public class Author {
    private Long id;
    private String firstName;
    private String lastName;

    public Author(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
