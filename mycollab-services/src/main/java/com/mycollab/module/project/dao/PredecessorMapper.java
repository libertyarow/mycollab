package com.mycollab.module.project.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.project.domain.Predecessor;
import com.mycollab.module.project.domain.PredecessorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface PredecessorMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    long countByExample(PredecessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    int deleteByExample(PredecessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    int insert(Predecessor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    int insertSelective(Predecessor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    List<Predecessor> selectByExample(PredecessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    Predecessor selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    int updateByExampleSelective(@Param("record") Predecessor record, @Param("example") PredecessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    int updateByExample(@Param("record") Predecessor record, @Param("example") PredecessorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    int updateByPrimaryKeySelective(Predecessor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    int updateByPrimaryKey(Predecessor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    Integer insertAndReturnKey(Predecessor value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_predecessor
     *
     * @mbg.generated Thu Oct 19 13:58:16 ICT 2017
     */
    void massUpdateWithSession(@Param("record") Predecessor record, @Param("primaryKeys") List primaryKeys);
}