import com.dao.UserMapper;
import com.pogo.User;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void test(){
        // 获得sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            // 1.执行 getmapper
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userDao.getUserList();

            // method 2
//        List<User> userList = sqlSession.selectList("com.hou.dao.UserDao.getUserList");

            for(User user: userList){
                System.out.println(user);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //关闭
            sqlSession.close();
        }

    }
}
