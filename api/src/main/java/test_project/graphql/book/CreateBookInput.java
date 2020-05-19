package test_project.graphql.book;

import lombok.Data;

@Data
public class CreateBookInput {
    String name;
    int pageCount;
    int authorId;
}
