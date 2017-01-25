package com.enrol

class BootStrap {

    def init = { servletContext ->

def computing = new Course(
title:'BSc Hon Computing',
code:'COMP234',
leader:'Dr Mary Poppins',
department:'Computing',
startDate:new Date('11/11/2016'),
endDate:new Date('11/11/2020'),
numberOfStudents:45,
description:'''A four year Computing course at Sheffield Hallam University''',
tuitionFees:9000,
studyMode:'full-time'
).save()

def engineering = new Course(
title:'BSc Hon Engineering',
code:'ENG384',
leader:'Dr Who',
department:'Engineering',
startDate:new Date('11/11/2016'),
endDate:new Date('11/11/2020'),
numberOfStudents:58,
description:'''A four year engineering course at Sheffield Hallam University''',
tuitionFees:9000,
studyMode:'full-time'
).save()

def LynneDawson = new Lecturer(
fullName:'Lynne Dawson',
post:'Course Leader',
subject:'BSc Computing',
lecturerEmail:'lynne.dawson@shu.ac.uk',
office:'Computing',
bio:'''BSc Computing course leader at Sheffield Hallam University'''
).save()



    }
    def destroy = {
    }
}
