package com.kodilla.rest.controller;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import com.kodilla.rest.domain.BookDto;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookControllerTest {
    @Test
    void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);

    }
    @Test
    void addBook_shouldCallBookService() {
        // given
        BookDto bookDto = new BookDto( "Test Book", "Test Author");

        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);

        // when
        bookController.addBook(bookDto);

        // then
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(bookDto);
    }



}
