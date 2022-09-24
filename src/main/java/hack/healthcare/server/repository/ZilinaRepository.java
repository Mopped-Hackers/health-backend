package hack.healthcare.server.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hack.healthcare.server.model.Aps;
import hack.healthcare.server.model.Lekaren;
import hack.healthcare.server.model.Test;
import hack.healthcare.server.model.ZilinaData;
import hack.healthcare.server.utils.HibernateUtil;

public class ZilinaRepository {

	public List<ZilinaData> saveZilinaDatas(List<ZilinaData> datas) {

		try {
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			Transaction transaction = session.beginTransaction();

			datas.stream().forEach(session::save);

			session.flush();
			transaction.commit();
			return datas;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

	public List<ZilinaData> getAllZilinaData() {
		try {
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			Transaction transaction = session.beginTransaction();

			List<ZilinaData> datas = session.createQuery("from ZilinaData", ZilinaData.class).list();

			session.flush();
			transaction.commit();

			return datas;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public List<Lekaren> saveLekarenDatas(List<Lekaren> datas) {

		try {
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			Transaction transaction = session.beginTransaction();

			datas.stream().forEach(session::save);

			session.flush();
			transaction.commit();
			return datas;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

	public List<Aps> saveApsDatas(List<Aps> datas) {
		try {
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			Transaction transaction = session.beginTransaction();

			datas.stream().forEach(session::save);

			session.flush();
			transaction.commit();
			return datas;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

}