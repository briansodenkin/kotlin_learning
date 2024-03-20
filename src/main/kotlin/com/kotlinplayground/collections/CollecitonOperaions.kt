package org.example.com.kotlinplayground.collections

import org.example.com.kotlinplayground.dataset.Course
import org.example.com.kotlinplayground.dataset.CourseCategory
import org.example.com.kotlinplayground.dataset.courseList


fun main(){
    val courseList = courseList()
    val filterPredicate = {
        c: Course -> c.category == CourseCategory.DEVELOPEMENT
    }
    println(exploreFilter(courseList, filterPredicate))
}

fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
): List<Course> {
    return courseList.filter {
        predicate.invoke(it)
    }
}