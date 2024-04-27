package nextstep.courses.domain.session.engine;

import java.util.List;
import nextstep.courses.domain.cover.Image;
import nextstep.courses.domain.session.enrollment.Enrollment;
import nextstep.courses.domain.session.name.SessionName;
import nextstep.courses.domain.session.period.Period;
import nextstep.courses.entity.BaseEntity;

public abstract class Session extends BaseEntity {

    private final Long id;

    private final SessionName sessionName;

    private Enrollment enrollment;

    private final List<Image> images;

    private final Period period;

    public Session(Long id, SessionName SessionName, Enrollment enrollment, List<Image> images,
        Period period) {
        this.id = id;
        this.sessionName = SessionName;
        this.enrollment = enrollment;
        this.images = images;
        this.period = period;
    }

    public Long getId() {
        return id;
    }

    public String getSessionName() {
        return sessionName.getValue();
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public List<Image> getImages() {
        return images;
    }

    public Period getPeriod() {
        return period;
    }
}
