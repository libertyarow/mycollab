package com.mycollab.module.crm.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.crm.domain.OpportunityLead;
import com.mycollab.module.crm.domain.OpportunityLeadExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface OpportunityLeadMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    long countByExample(OpportunityLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    int deleteByExample(OpportunityLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    @Delete({
        "delete from m_crm_opportunities_leads",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    @Insert({
        "insert into m_crm_opportunities_leads (id, opportunityId, ",
        "leadId, createdTime, ",
        "isConvertRel)",
        "values (#{id,jdbcType=INTEGER}, #{opportunityid,jdbcType=INTEGER}, ",
        "#{leadid,jdbcType=INTEGER}, #{createdtime,jdbcType=TIMESTAMP}, ",
        "#{isconvertrel,jdbcType=BIT})"
    })
    int insert(OpportunityLead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    int insertSelective(OpportunityLead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    List<OpportunityLead> selectByExample(OpportunityLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    @Select({
        "select",
        "id, opportunityId, leadId, createdTime, isConvertRel",
        "from m_crm_opportunities_leads",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.mycollab.module.crm.dao.OpportunityLeadMapper.BaseResultMap")
    OpportunityLead selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    int updateByExampleSelective(@Param("record") OpportunityLead record, @Param("example") OpportunityLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    int updateByExample(@Param("record") OpportunityLead record, @Param("example") OpportunityLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    int updateByPrimaryKeySelective(OpportunityLead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    @Update({
        "update m_crm_opportunities_leads",
        "set opportunityId = #{opportunityid,jdbcType=INTEGER},",
          "leadId = #{leadid,jdbcType=INTEGER},",
          "createdTime = #{createdtime,jdbcType=TIMESTAMP},",
          "isConvertRel = #{isconvertrel,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(OpportunityLead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    Integer insertAndReturnKey(OpportunityLead value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_opportunities_leads
     *
     * @mbg.generated Thu Oct 19 13:57:50 ICT 2017
     */
    void massUpdateWithSession(@Param("record") OpportunityLead record, @Param("primaryKeys") List primaryKeys);
}