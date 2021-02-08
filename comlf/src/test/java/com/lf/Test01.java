package com.lf;
import com.lf.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/**
 * @ClassName: Test01
 * @Description:
 * @Author: 李峰
 * @Date: 2021 年 02月 08 22:34
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //1.定义Mybatis的主配置文件的信息   从类路径的根开始(target/classes)开始
        String conflg="Mybatis.xml";
        //2.读取这个表示文件
        InputStream in = Resources.getResourceAsStream(conflg);
        //3.创建sqlsessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //4.创建sqlsessionFactory对象
        SqlSessionFactory factory = builder.build(in );
        //5.从sqlsessionFactory中获取sqlsession对象(重要)
        SqlSession sqlSession = factory.openSession();
        //6.指定要执行的sql语句的标识   格式为 sql映射文件中的namespace+.+标签中的id值
        String sqlId="com.lf.Dao.StudentDao"+"."+"selectStudent";
        //7.执行sql语句
        List<Student> student = sqlSession.selectList(sqlId);
        //8.遍历输出结果
        for (Student student1 : student) {
            System.out.println(student1);
        }
        //9.关闭流
        sqlSession.close();
    }
}
