package test_project.graphql.author;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test_project.jooq.generated.tables.records.AuthorsRecord;

import static test_project.jooq.generated.tables.Authors.AUTHORS;

@Component
public class AuthorMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private DefaultDSLContext dsl;

    public CreateAuthorPayload createAuthor(CreateAuthorInput input) {
        AuthorsRecord authorsRecord = dsl.newRecord(AUTHORS);

        authorsRecord.setFirstName(input.getFirstName());
        authorsRecord.setLastName(input.getLastName());

        authorsRecord.store();

        Author author = authorsRecord.into(Author.class);

        return new CreateAuthorPayload(author);
    }
}
