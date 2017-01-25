package com.enrol

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void totalFees() {

when: "A course has title and tuitionFees"
def computing=new Course(title: 'BSc Hon Computing', tuitionFees:9500)
then: "The calculateFees method will total tuitionFees"
computing.calculateFees()==38000

    }
}
