package com.trs.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * ����ѧ���ļ����¼�
 */
public class StudentAddEvent extends ApplicationEvent {

    /**
     * 
     */
    private static final long serialVersionUID = 20L;

    /**
     * ѧ������
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
     * ��ȡѧ������
     * 
     * @return
     */
    public String getStudentName() {
        return m_sStudentName;
    }

}
