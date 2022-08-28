package com.test.repository;

import java.util.List;

import com.test.controller.Library;

public interface LibraryRepositoryCustom {
	
	List<Library> findAllByAuthor(String authorName);

	Library findByName(String bookName);

}
