package com.gyz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * gerCurrentSession ���Զ��ر�session��ʹ�õ��ǵ�ǰ��session����
	 * @return
	 */
	public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
	
	/**
     * openSession ��Ҫ�ֶ��ر�session ��˼�Ǵ�һ���µ�session
     * @return
     */
    public Session getNewSession() {
        return sessionFactory.openSession();
    }

    public void flush() {
        getSession().flush();
    }

    public void clear() {
        getSession().clear();
    }
    
    /**
     * ����ID��ѯ��Ϣ
     * @param c
     * @param id
     * @return
     */
    public Object load(Class<?> c, String id) {
        Session session = getSession();
        return session.get(c, id);
    }
    /**
     * ��ȡ������Ϣ
     * @param c
     * @return
     */
    public List<?> getAllList(Class<?> c) {
        String hql = "from " + c.getName();
        Session session = getSession();
        return session.createQuery(hql).list();
    }
    /**
     * ��ȡ������
     * @param c
     * @return
     */
    public Long getTotalCount(Class<?> c) {
        Session session = getNewSession();
        String hql = "select count(*) from " + c.getName();
        Long count = (Long) session.createQuery(hql).uniqueResult();
        session.close();
        return count != null ? count.longValue() : 0;
    }
    /**
     * ������Ϣ
     * @param bean
     */
    public void save(Object bean) {
        try {
            Session session = getNewSession();
            session.save(bean);
            session.flush();
            session.clear();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * ������Ϣ
     * @param bean
     */
    public void update(Object bean) {
        Session session = getNewSession();
        session.update(bean);
        session.flush();
        session.clear();
        session.close();
    }
    /**
     * ɾ��
     * @param bean
     */
    public void delete(Object bean) {
        Session session = getNewSession();
        session.delete(bean);
        session.flush();
        session.clear();
        session.close();
    }

    /**
     * ����IDɾ��
     * @param c ��
     * @param id ID
     */
    public void delete(Class c, String id) {
        Session session = getNewSession();
        Object obj = session.get(c, id);
        session.delete(obj);
        flush();
        clear();
    }

    /**
     * ����ɾ��
     * @param c ��
     * @param ids ID ����
     */
    public void delete(Class c, String[] ids) {
        for (String id : ids) {
            Object obj = getSession().get(c, id);
            if (obj != null) {
                getSession().delete(obj);
            }
        }
    }
}
