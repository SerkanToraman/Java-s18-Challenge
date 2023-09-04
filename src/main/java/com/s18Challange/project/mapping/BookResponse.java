package com.s18Challange.project.mapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
    private int bookId;
    private String bookName;
    private String categoryName;
    private String authorFirstName;
    private String authorLastName;

    public BookResponse(int bookId, String bookName, String categoryName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.categoryName = categoryName;
    }
}
