package org.example.repository;
import org.example.model.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//generic으로 앞에는 db에 연결될 객체인 todoEntity를
//뒤에는 해당 객체의 id에 해당하는 필드 타입을 넣어준다.
//anotation은 왜해주는지.
@Repository
public interface TodoRepository extends JpaRepository<TodoModel, Long> {
}
