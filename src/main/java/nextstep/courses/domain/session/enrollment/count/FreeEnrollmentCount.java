package nextstep.courses.domain.session.enrollment.count;

import nextstep.courses.domain.session.enrollment.count.engine.AbstractEnrollmentCount;

public class FreeEnrollmentCount extends AbstractEnrollmentCount {

    public FreeEnrollmentCount(RegistrationCount registrationCount) {
        super(registrationCount);
    }

    @Override
    public boolean isRegistrationWithinCapacity() {
        return registrationCount.getValue() < Integer.MAX_VALUE;
    }
}
