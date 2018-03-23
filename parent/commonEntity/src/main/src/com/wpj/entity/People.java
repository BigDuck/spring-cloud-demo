package com.wpj.entity;

import java.io.Serializable;

/**
 * 用户信息
 *
 * @author wupj on 2018/3/23 10:14.
 */
public class People implements Serializable {
    private static final long serialVersionUID = -6889681066048587905L;
    /**
     * 用户名字
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 婚姻是否结婚
     */
    private Boolean marriage;
    /**
     * 薪水
     */
    private Double salary;
    /**
     * 身高
     */
    private Float height;

    public People() {
    }

    public People(String name, Integer age, Boolean marriage, Double salary, Float height) {
        this.name = name;
        this.age = age;
        this.marriage = marriage;
        this.salary = salary;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarriage() {
        return marriage;
    }

    public void setMarriage(Boolean marriage) {
        this.marriage = marriage;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marriage=" + marriage +
                ", salary=" + salary +
                ", height=" + height +
                '}';
    }
}
