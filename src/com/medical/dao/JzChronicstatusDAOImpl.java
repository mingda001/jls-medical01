package com.medical.dao;

import com.medical.model.JzChronicstatus;
import com.medical.model.JzChronicstatusExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class JzChronicstatusDAOImpl extends SqlMapClientDaoSupport implements
		JzChronicstatusDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	public JzChronicstatusDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	public int countByExample(JzChronicstatusExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"JZ_CHRONICSTATUS.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	public int deleteByExample(JzChronicstatusExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"JZ_CHRONICSTATUS.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	public int deleteByPrimaryKey(Long chronicstatusId) {
		JzChronicstatus key = new JzChronicstatus();
		key.setChronicstatusId(chronicstatusId);
		int rows = getSqlMapClientTemplate().delete(
				"JZ_CHRONICSTATUS.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	public Long insert(JzChronicstatus record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"JZ_CHRONICSTATUS.ibatorgenerated_insert", record);
		return (Long) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	public Long insertSelective(JzChronicstatus record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"JZ_CHRONICSTATUS.ibatorgenerated_insertSelective", record);
		return (Long) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	@SuppressWarnings("unchecked") public List<JzChronicstatus> selectByExample(JzChronicstatusExample example){List<JzChronicstatus> list=getSqlMapClientTemplate().queryForList("JZ_CHRONICSTATUS.ibatorgenerated_selectByExample",example);return list;}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	public JzChronicstatus selectByPrimaryKey(Long chronicstatusId) {
		JzChronicstatus key = new JzChronicstatus();
		key.setChronicstatusId(chronicstatusId);
		JzChronicstatus record = (JzChronicstatus) getSqlMapClientTemplate()
				.queryForObject(
						"JZ_CHRONICSTATUS.ibatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	public int updateByExampleSelective(JzChronicstatus record,
			JzChronicstatusExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"JZ_CHRONICSTATUS.ibatorgenerated_updateByExampleSelective",
				parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	public int updateByExample(JzChronicstatus record,
			JzChronicstatusExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"JZ_CHRONICSTATUS.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	public int updateByPrimaryKeySelective(JzChronicstatus record) {
		int rows = getSqlMapClientTemplate().update(
				"JZ_CHRONICSTATUS.ibatorgenerated_updateByPrimaryKeySelective",
				record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	public int updateByPrimaryKey(JzChronicstatus record) {
		int rows = getSqlMapClientTemplate().update(
				"JZ_CHRONICSTATUS.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table YLJZN.JZ_CHRONICSTATUS
	 * @ibatorgenerated  Mon Oct 27 15:50:27 CST 2014
	 */
	private static class UpdateByExampleParms extends JzChronicstatusExample {
		private Object record;

		public UpdateByExampleParms(Object record,
				JzChronicstatusExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}

	@SuppressWarnings("unchecked")
	public List<JzChronicstatus> selectByExample(
			JzChronicstatusExample example, int start, int pagesize) {
		List<JzChronicstatus> list = getSqlMapClientTemplate().queryForList(
				"JZ_CHRONICSTATUS.ibatorgenerated_selectByExample", example,
				start, pagesize);
		return list;
	}
}