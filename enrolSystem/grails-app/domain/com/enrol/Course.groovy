package com.enrol

class Course {

String department
String title
String leader
String code
Date startDate
Date endDate
String description
int numberOfStudents
double tuitionFees
String studyMode

double calculateFees(){

4*tuitionFees

}

    static constraints = {

department blank:false, nullable:false
title blank:false, nullable:false
leader blank:false, nullable:false
code blank:false, nullable:false
numberOfStudents blank:false, nullable:false, min:20, max:60
startDate blank:false, nullable:false
endDate blank:false, nullable:false
studyMode blank:false, nullable:false, size:1..20
description blank:false, nullable:false, maxSize:5000, widget:'textarea'
tuitionFees blank:false, nullable:false, scale:3

    }
}
