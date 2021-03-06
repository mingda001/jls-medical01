package com.medical.dao;

import com.medical.model.SysTOrganization;
import com.medical.model.SysTOrganizationExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class SysTOrganizationDAOImpl extends SqlMapClientDaoSupport implements SysTOrganizationDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    public SysTOrganizationDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    public int countByExample(SysTOrganizationExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("SYS_T_ORGANIZATION.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    public int deleteByExample(SysTOrganizationExample example) {
        int rows = getSqlMapClientTemplate().delete("SYS_T_ORGANIZATION.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    public int deleteByPrimaryKey(String organizationId) {
        SysTOrganization key = new SysTOrganization();
        key.setOrganizationId(organizationId);
        int rows = getSqlMapClientTemplate().delete("SYS_T_ORGANIZATION.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    public void insert(SysTOrganization record) {
        getSqlMapClientTemplate().insert("SYS_T_ORGANIZATION.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    public void insertSelective(SysTOrganization record) {
        getSqlMapClientTemplate().insert("SYS_T_ORGANIZATION.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    @SuppressWarnings("unchecked")
    public List<SysTOrganization> selectByExample(SysTOrganizationExample example) {
        List<SysTOrganization> list = getSqlMapClientTemplate().queryForList("SYS_T_ORGANIZATION.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    public SysTOrganization selectByPrimaryKey(String organizationId) {
        SysTOrganization key = new SysTOrganization();
        key.setOrganizationId(organizationId);
        SysTOrganization record = (SysTOrganization) getSqlMapClientTemplate().queryForObject("SYS_T_ORGANIZATION.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    public int updateByExampleSelective(SysTOrganization record, SysTOrganizationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SYS_T_ORGANIZATION.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    public int updateByExample(SysTOrganization record, SysTOrganizationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SYS_T_ORGANIZATION.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    public int updateByPrimaryKeySelective(SysTOrganization record) {
        int rows = getSqlMapClientTemplate().update("SYS_T_ORGANIZATION.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    public int updateByPrimaryKey(SysTOrganization record) {
        int rows = getSqlMapClientTemplate().update("SYS_T_ORGANIZATION.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table YLJZN.SYS_T_ORGANIZATION
     *
     * @ibatorgenerated Wed Aug 12 11:56:50 CST 2009
     */
    private static class UpdateByExampleParms extends SysTOrganizationExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysTOrganizationExample example) {
            super(example);
            this.record = record;
        }

        @SuppressWarnings("unused")
		public Object getRecord() {
            return record;
        }
    }
}