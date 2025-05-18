package com.bookVerse.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private String title;
    private String author;
    private Double price;
    private int stock;
    private LocalDate publishedDate;
}
