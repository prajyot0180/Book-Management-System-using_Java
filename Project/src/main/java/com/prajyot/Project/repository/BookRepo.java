package com.prajyot.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prajyot.Project.models.Book;


@Repository
public interface BookRepo extends JpaRepository<Book, Long>{


	Book findByTitleContainingIgnoreCase(String tittle);

}
