package test_project.graphql.book;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test_project.graphql.author.Author;

import static test_project.jooq.generated.tables.Authors.AUTHORS;
import static test_project.jooq.generated.tables.Books.BOOKS;

@Component
public class BookResolver implements GraphQLResolver<Book> {

    @Autowired
    private DefaultDSLContext dsl;

    public Author getAuthor(Book book) {
        return dsl.select(AUTHORS.fields())
                .from(AUTHORS)
                .innerJoin(BOOKS)
                .on(BOOKS.AUTHOR_ID.eq(AUTHORS.ID))
                .where(BOOKS.ID.eq(book.getId())).fetchOneInto(Author.class);
    }
}
