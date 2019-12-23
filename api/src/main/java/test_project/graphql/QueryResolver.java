package test_project.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test_project.graphql.author.Author;
import test_project.graphql.book.Book;

import java.util.List;

import static test_project.jooq.generated.tables.Authors.AUTHORS;
import static test_project.jooq.generated.tables.Books.BOOKS;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private DefaultDSLContext dsl;

    public Book bookById(Integer id) {
        return dsl.select()
                .from(BOOKS)
                .where(BOOKS.ID.eq(id))
                .fetchOneInto(Book.class);

    }

    public Author authorById(Integer id) {
        return dsl.select()
                .from(AUTHORS)
                .where(AUTHORS.ID.eq(id))
                .fetchOneInto(Author.class);
    }

    public List<Author> allAuthors() {
        return dsl.select()
                .from(AUTHORS)
                .fetchInto(Author.class);
    }
}
