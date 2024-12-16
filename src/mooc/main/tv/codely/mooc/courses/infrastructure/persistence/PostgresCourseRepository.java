package tv.codely.mooc.courses.infrastructure.persistence;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import tv.codely.mooc.courses.domain.CourseRepository;
import tv.codely.mooc.courses.infrastructure.persistence.entity.CourseEntity;
import tv.codely.shared.domain.Service;

import java.util.Optional;


@Service
public class PostgresCourseRepository implements CourseRepository {

    private final SessionFactory sessionFactory;

    public PostgresCourseRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public void save(CourseEntity course) {
        sessionFactory.getCurrentSession().persist(course);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CourseEntity> search(String id) {
        return Optional.ofNullable(sessionFactory.getCurrentSession().find(CourseEntity.class, id));
    }
}
