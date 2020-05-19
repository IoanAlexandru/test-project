package test_project.graphql.book;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test_project.jooq.generated.tables.records.BooksRecord;

import static test_project.jooq.generated.tables.Books.BOOKS;

@Component
public class BookMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private DefaultDSLContext dsl;

    public CreateBookPayload createBook(CreateBookInput input) {
        BooksRecord booksRecord = dsl.newRecord(BOOKS);

        booksRecord.setName(input.getName());
        booksRecord.setPageCount(input.getPageCount());
        booksRecord.setAuthorId(input.getAuthorId());

        booksRecord.store();

        Book book = booksRecord.into(Book.class);

        return new CreateBookPayload(book);
    }
}
