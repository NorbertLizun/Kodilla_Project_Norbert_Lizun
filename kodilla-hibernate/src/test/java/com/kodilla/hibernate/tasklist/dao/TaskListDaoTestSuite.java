package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("TODO LIST", "Description");
        taskListDao.save(taskList);

        //When
        List<TaskList> nameList = taskListDao.findByListName("TODO LIST");

        //Then
        assertEquals(1, nameList.size());

        //CleanUp
        int id = nameList.get(0).getId();
        taskListDao.deleteById(id);



    }
}
