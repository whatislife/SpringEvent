package com.trs.spring.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class StudentAddBean implements ApplicationContextAware {
    /**
     * ����Spring�����Ķ���
     */
    private ApplicationContext m_applicationContext = null;

    public void setApplicationContext(ApplicationContext _applicationContext)
            throws BeansException {
        this.m_applicationContext = _applicationContext;

    }

    /**
     * ����һ��ѧ��
     * 
     * @param _sStudentName
     */ 
    public void addStudent(String _sStudentName) {
        // 1.����һ������ѧ�����¼�
        StudentAddEvent aStudentEvent = new StudentAddEvent(
                m_applicationContext, _sStudentName);
        // 2.��������ѧ���¼�
        m_applicationContext.publishEvent(aStudentEvent);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] xmlConfig = new String[] { "applicationContext.xml" };
        // ʹ��ApplicationContext����ʼ��ϵͳ
        ApplicationContext context = new ClassPathXmlApplicationContext(
                xmlConfig);
        StudentAddBean studentBean = (StudentAddBean) context
                .getBean("StudentAddBean");
        studentBean.addStudent("���ǵ�һ��ѧ��");
        studentBean.addStudent("�ڶ���ѧ���Ѿ����");
    }

}
