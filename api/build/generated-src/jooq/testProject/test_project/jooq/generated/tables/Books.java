/*
 * This file is generated by jOOQ.
 */
package test_project.jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import test_project.jooq.generated.Indexes;
import test_project.jooq.generated.Keys;
import test_project.jooq.generated.Public;
import test_project.jooq.generated.tables.records.BooksRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Books extends TableImpl<BooksRecord> {

    private static final long serialVersionUID = -1210086001;

    /**
     * The reference instance of <code>public.books</code>
     */
    public static final Books BOOKS = new Books();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BooksRecord> getRecordType() {
        return BooksRecord.class;
    }

    /**
     * The column <code>public.books.id</code>.
     */
    public final TableField<BooksRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.books.name</code>.
     */
    public final TableField<BooksRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.books.page_count</code>.
     */
    public final TableField<BooksRecord, Integer> PAGE_COUNT = createField("page_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.books.author_id</code>.
     */
    public final TableField<BooksRecord, Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.books</code> table reference
     */
    public Books() {
        this(DSL.name("books"), null);
    }

    /**
     * Create an aliased <code>public.books</code> table reference
     */
    public Books(String alias) {
        this(DSL.name(alias), BOOKS);
    }

    /**
     * Create an aliased <code>public.books</code> table reference
     */
    public Books(Name alias) {
        this(alias, BOOKS);
    }

    private Books(Name alias, Table<BooksRecord> aliased) {
        this(alias, aliased, null);
    }

    private Books(Name alias, Table<BooksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Books(Table<O> child, ForeignKey<O, BooksRecord> key) {
        super(child, key, BOOKS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BOOKS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BooksRecord> getPrimaryKey() {
        return Keys.BOOKS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BooksRecord>> getKeys() {
        return Arrays.<UniqueKey<BooksRecord>>asList(Keys.BOOKS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BooksRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BooksRecord, ?>>asList(Keys.BOOKS__BOOKS_AUTHOR_ID_FKEY);
    }

    public Authors authors() {
        return new Authors(this, Keys.BOOKS__BOOKS_AUTHOR_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Books as(String alias) {
        return new Books(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Books as(Name alias) {
        return new Books(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Books rename(String name) {
        return new Books(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Books rename(Name name) {
        return new Books(name, null);
    }
}
