package com.bookVerse.dto;

import java.time.LocalDate;
import java.util.Optional;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookUpdateDTO {

	private Optional<String> title = Optional.empty();
	private Optional<String> author = Optional.empty();
	private Optional<Double> price = Optional.empty();
	private Optional<Integer> stock = Optional.empty();
	private Optional<LocalDate> publishedDate = Optional.empty();
}
