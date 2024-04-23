package nextstep.courses.domain.session.impl;

import nextstep.courses.domain.cover.Image;
import nextstep.courses.domain.session.AbstractSession;
import nextstep.courses.domain.session.RegistrationCount;
import nextstep.courses.domain.session.SessionName;
import nextstep.courses.domain.session.SessionStatus;
import nextstep.courses.domain.session.Period;
import nextstep.courses.entity.SessionEntity;
import nextstep.payments.domain.Money;

public class FreeSession extends AbstractSession {

    public FreeSession(SessionName sessionName, Image image, SessionStatus sessionStatus,
        Period period) {
        this(null,
            sessionName,
            new RegistrationCount(0),
            new Money(0),
            image,
            sessionStatus,
            period);
    }

    public FreeSession(SessionEntity sessionEntity) {
        this(sessionEntity.getId(),
            new SessionName(sessionEntity.getSessionName()),
            new RegistrationCount(sessionEntity.getRegistrationCount()),
            new Money(sessionEntity.getTuitionFee()),
            null,
            SessionStatus.valueOf(sessionEntity.getSessionStatus()),
            new Period(sessionEntity.getStartDate(), sessionEntity.getUpdatedAt()));
    }

    public FreeSession(Long id, SessionName sessionName, RegistrationCount registrationCount,
        Money tuitionFee,
        Image image, SessionStatus sessionStatus, Period period) {
        super(id, sessionName, registrationCount, tuitionFee, image, sessionStatus, period);
    }
}
