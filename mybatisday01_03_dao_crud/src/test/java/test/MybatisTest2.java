package test;

import com.neusoft.dao.IEmpDao;
import com.neusoft.domain.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author Joker_Dong
 * @date 2020-9-4 10:05
 */

public class MybatisTest2 {
    private InputStream inputStream;
    private SqlSessionFactoryBuilder factoryBuilder;
    private SqlSessionFactory sessionFactory;
    private SqlSession sqlSession;
    private IEmpDao empDao;
    @Before
    public void init() throws IOException {

        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        factoryBuilder = new SqlSessionFactoryBuilder();
        sessionFactory = factoryBuilder.build(inputStream);
        sqlSession = sessionFactory.openSession();
        empDao = sqlSession.getMapper(IEmpDao.class);
    }
    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void testFindAll(){
        List<Emp> emps = empDao.findAll();
        for (Emp emp:emps
             ) {
            System.out.println(emp);
        }
    }
    @Test
    public void testFindById(){
        Emp emp = empDao.findById(7369);
//        for (Emp emp:emps
//        ) {
            System.out.println(emp);
//        }
    }
    @Test
    public void testSaveEmp(){
        Emp emp = new Emp();
        emp.setEMPNO(8888);
        emp.setENAME("孙悟空");
        emp.setHIREDATE(new Date());
        emp.setCOMM(100000);
        emp.setMGR(null);
        emp.setSAL(1000000);
        emp.setJOB("MANAGER");
        emp.setDEPTNO(20);
        int i = empDao.saveEmp(emp);
        System.out.println("影响行数： " + i);
    }
    @Test
    public void testUpdateEmp(){
        Emp emp = new Emp();
        emp.setENAME("孙悟空kong");
        emp.setHIREDATE(new Date());
        emp.setCOMM(100000);
        emp.setMGR(null);
        emp.setSAL(1000000);
        emp.setJOB("MANAGER");
        emp.setDEPTNO(20);
        emp.setEMPNO(7934);
        int i = empDao.updateEmp(emp);
        System.out.println("影响行数： " + i);
    }
}
