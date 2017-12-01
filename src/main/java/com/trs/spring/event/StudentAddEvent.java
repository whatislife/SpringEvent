package com.trs.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * 增加学生的监听事件
 */
public class StudentAddEvent extends ApplicationEvent {

    /**
     * 
     */
    private static final long serialVersionUID = 20L;

    /**
     * 学生姓名
     */
    private String m_sStudentName;

    /**
     * @param source
     */
    public StudentAddEvent(Object source, String _sStudentName) {
        super(source);
        this.m_sStudentName = _sStudentName;
    }

    /**
     * 获取学生姓名
     * 
     * @return
     */
    public String getStudentName() {
        return m_sStudentName;
    }

}
