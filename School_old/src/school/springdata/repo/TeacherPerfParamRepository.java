package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.TeacherPerfParam;

@Repository("teacherPerfParamRepository")
public interface TeacherPerfParamRepository   extends CrudRepository<TeacherPerfParam,Integer>{

}
