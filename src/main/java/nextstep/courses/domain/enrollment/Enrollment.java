package nextstep.courses.domain.enrollment;

import nextstep.courses.domain.session.Session;
import nextstep.courses.domain.session.SessionStatus;
import nextstep.payments.domain.Money;
import nextstep.payments.domain.Payment;

public interface Enrollment {

    default boolean isRecruitmentOpen(SessionStatus sessionStatus) {
        return SessionStatus.RECRUITING == sessionStatus;
    }

    void enroll(Session session, Payment payment);

    boolean isPaymentAmountSameTuitionFee(Payment payment);

    StudentName getStudentName();

    Long getSessionId();

    Money getTuitionFee();
}
