package com.byon.graphnote.graphnote;

import com.byon.graphnote.graphnote.models.Book;
import com.byon.graphnote.graphnote.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GraphnoteApplication implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(GraphnoteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book sample = Book.builder().title("Sample Book").author("mike").build();
		Book connor = Book.builder().title("Connor").author("mike").build();
		bookRepository.save(sample);
		bookRepository.save(connor);

	}
}
