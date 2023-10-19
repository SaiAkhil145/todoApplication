package com.geekster.todoApplication.Repo;

import com.geekster.todoApplication.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface ITodoRepo extends JpaRepository<Todo,Integer> {
}
