import java.io.InputStream;
import java.util.List;

import com.example.dao.JobDao;
import com.example.domain.Job;
import com.example.service.JobService;
import com.example.service.impl.JobServiceImpl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        JobService js = ac.getBean("JobService", JobServiceImpl.class);
        js.findAll();
    }

    @Test
    public void test2() throws Exception {
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        JobDao jd = session.getMapper(JobDao.class);
        List<Job> jobs = jd.findAll();
        for (Job job : jobs) {
            System.out.println(job);
        }
        session.close();
        in.close();
    }

    @Test
    public void test3() throws Exception {
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        JobDao jd = session.getMapper(JobDao.class);
        Job job = new Job();
        job.setId("aaa");
        job.setMinSalary(0L);
        job.setTitle("bbb");
        jd.save(job);
        session.commit();
        session.close();
        in.close();
    }
}
