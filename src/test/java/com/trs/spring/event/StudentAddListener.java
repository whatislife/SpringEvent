package com.trs.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class StudentAddListener implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent _event) {
        // 1.�ж��Ƿ�������ѧ��������¼�
        if (!(_event instanceof StudentAddEvent)) {
            return;
        }
        // 2.������ѧ���¼��Ķ��󣬽����߼������������־�����ֵ�
        StudentAddEvent studentAddEvent = (StudentAddEvent) _event;
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("������ѧ��:::" + studentAddEvent.getStudentName());
    }

}
