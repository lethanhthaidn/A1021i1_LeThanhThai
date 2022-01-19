package ss8_CleanCode.mvc.model.repository;

import ss8_CleanCode.mvc.model.model.Student;

public interface IStudentRepository {
    Student[] getAll();
    Student[] add();

}
