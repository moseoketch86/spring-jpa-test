package com.demo.springjpa.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Course {
 @Id
 @SequenceGenerator(
         name = "course_sequence",
         sequenceName = "sequence_name",
         allocationSize = 1
 )
 @GeneratedValue(
     strategy= GenerationType.SEQUENCE,
     generator="course_sequence"
 )
 private Long courseId;
 private String title;
 private Integer credit;
}
