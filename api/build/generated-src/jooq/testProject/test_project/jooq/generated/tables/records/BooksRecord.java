/*
 * This file is generated by jOOQ.
 */
package test_project.jooq.generated.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import test_project.jooq.generated.tables.Books;


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
public class BooksRecord extends UpdatableRecordImpl<BooksRecord> implements Record4<Integer, String, Integer, Integer> {

    private static final long serialVersionUID = -136203271;

    /**
     * Setter for <code>public.books.id</code>.
     */
    public BooksRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.books.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.books.name</code>.
     */
    public BooksRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.books.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.books.page_count</code>.
     */
    public BooksRecord setPageCount(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.books.page_count</code>.
     */
    public Integer getPageCount() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.books.author_id</code>.
     */
    public BooksRecord setAuthorId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.books.author_id</code>.
     */
    public Integer getAuthorId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Books.BOOKS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Books.BOOKS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Books.BOOKS.PAGE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Books.BOOKS.AUTHOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getPageCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPageCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BooksRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BooksRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BooksRecord value3(Integer value) {
        setPageCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BooksRecord value4(Integer value) {
        setAuthorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BooksRecord values(Integer value1, String value2, Integer value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BooksRecord
     */
    public BooksRecord() {
        super(Books.BOOKS);
    }

    /**
     * Create a detached, initialised BooksRecord
     */
    public BooksRecord(Integer id, String name, Integer pageCount, Integer authorId) {
        super(Books.BOOKS);

        set(0, id);
        set(1, name);
        set(2, pageCount);
        set(3, authorId);
    }
}
