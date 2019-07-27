package com.zlf.demo01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private int id;
    private String enmae;
    private int job_id;
    private int mgr;
    private Date joindate;
    private double salary;
    private double bonus;
    private int dept_id;
}
