package top.simba1949;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.simba1949.domain.User;
import top.simba1949.mapper.UserMapper;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @author anthony
 * @date 2022/4/12
 */
@Slf4j
public class Application {
  public static void main(String[] args) {
    try {
      // 读取配置文件
      Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
      // 构建SQL会话工厂
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
      // 获取会话
      SqlSession sqlSession = sqlSessionFactory.openSession();
      // 获取Mapper
      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
      // 执行SQL语句，获取结果
      List<User> userList = userMapper.selectAll();
      userList.forEach(ele -> log.info("{}", ele));
      sqlSession.close();
    } catch (IOException e) {
      log.error("the exception is {}", e.getMessage(), e);
    }
  }
}
